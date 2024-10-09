package co.edu.uniquindio.marketplace.viewcontroller;

import co.edu.uniquindio.marketplace.controller.VendedorController;
import co.edu.uniquindio.marketplace.mapping.dto.VendedorDto;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class VendedorViewController {
    VendedorController vendedorController;
    ObservableList<VendedorDto> listVendedoresDto = FXCollections.observableArrayList();
    VendedorDto selectedVendedor;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnEliminar;

    @FXML
    private TableView<VendedorDto> tableVendedor;

    @FXML
    private TableColumn<VendedorDto, String> tcNombres;

    @FXML
    private TableColumn<VendedorDto, String> tcApellidos;

    @FXML
    private TableColumn<VendedorDto, String> tcCedula;

    @FXML
    private TableColumn<VendedorDto, String> tcDireccion;

    @FXML
    private TableColumn<VendedorDto, Integer> tcUsuario;

    @FXML
    private TableColumn<VendedorDto, String> tcContrasena;

    @FXML
    private TextField txtNombres;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtUsuario;

    @FXML
    private TextField txtContrasena;

    @FXML
    void onActualizarVendedor(ActionEvent event) {

    }

    @FXML
    void onAgregarVendedor(ActionEvent event) {
        crearVendedor();
    }

    @FXML
    void onEliminarVendedor(ActionEvent event) {

    }

    @FXML
    void initialize() {
        vendedorController = new VendedorController();

        initView();
    }

    private void initView() {
        initDataBinding();
        obtenerVendedores();
        tableVendedor.getItems().clear();
        tableVendedor.setItems(listVendedoresDto);
        listenerSelection();
    }

    private void initDataBinding() {
        tcNombres.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombres()));
        tcApellidos.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().apellidos()));
        tcCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().cedula()));
        tcDireccion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().direccion()));
        tcUsuario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().usuario()));
        tcContrasena.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().contrasena()));
    }

    private void obtenerVendedores() {
        listVendedoresDto.addAll(vendedorController.obtenerVendedores());
    }

    private void listenerSelection() {
        tableVendedor.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedVendedor = newSelection;
            mostrarInformacionVendedor(selectedVendedor);
        });
    }

    private void mostrarInformacionVendedor(VendedorDto vendedor) {
        if (vendedor != null) {
            txtNombres.setText(vendedor.nombres());
            txtApellidos.setText(vendedor.apellidos());
            txtCedula.setText(vendedor.cedula());
            txtDireccion.setText(vendedor.direccion());
            txtUsuario.setText(vendedor.usuario());
            txtContrasena.setText(vendedor.contrasena());
        }
    }

    private void crearVendedor() {
        VendedorDto newVendedorDto = buildVendedorDto();

        if (vendedorController.agregarVendedor(newVendedorDto)) {
            listVendedoresDto.add(newVendedorDto);
            limpiarCamposVendedor();
        }
    }

    private VendedorDto buildVendedorDto() {
        return new VendedorDto(
                txtNombres.getText(),
                txtApellidos.getText(),
                txtCedula.getText(),
                txtDireccion.getText(),
                txtUsuario.getText(),
                txtContrasena.getText()
        );
    }

    private void limpiarCamposVendedor() {
        txtNombres.clear();
        txtApellidos.clear();
        txtCedula.clear();
        txtDireccion.clear();
        txtUsuario.clear();
        txtContrasena.clear();

    }
}