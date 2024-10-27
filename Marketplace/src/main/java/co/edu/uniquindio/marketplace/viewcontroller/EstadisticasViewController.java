package co.edu.uniquindio.marketplace.viewcontroller;

import co.edu.uniquindio.marketplace.model.Vendedor;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.util.List;

public class EstadisticasViewController {

    @FXML
    private Label cantidadProductosLabel;
    @FXML
    private Label cantidadContactosLabel;
    @FXML
    private ListView<String> topProductosListView;

    private Vendedor vendedor;

    public void initialize() {
        actualizarEstadisticas();
    }

    @FXML
    private void actualizarEstadisticas() {
        cantidadProductosLabel.setText(String.valueOf(vendedor.getProductos().size()));
        cantidadContactosLabel.setText(String.valueOf(vendedor.getContactos().size()));

    }
}
