package co.edu.uniquindio.marketplace.viewcontroller;

import co.edu.uniquindio.marketplace.MarketplaceApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginViewController {

    @FXML
    private TextField usuarioTextField; // campo de texto para el nombre de usuario

    @FXML
    private PasswordField contraseniaField; // campo de texto para la contraseña

    @FXML
    private ChoiceBox<String> choiceBox; // tipo de usuario (Vendedor ó Administrador)

    @FXML
    private Button ingresarButton; // botón de ingresar

    @FXML
    private void initialize() {
        choiceBox.getItems().addAll("Vendedor", "Administrador");

        ingresarButton.setOnAction(event -> handleLogin());
    }

    private void handleLogin() {
        String usuario = usuarioTextField.getText();
        String contrasenia = contraseniaField.getText();
        String tipoUsuario = choiceBox.getValue();

        boolean usuarioValido = verificarUsuario(usuario, contrasenia, tipoUsuario);

        if (usuarioValido) {
            cargarMuro();
        }else{
            cargarRegistro();
        }
    }

    private boolean verificarUsuario(String usuario, String contrasenia, String tipoUsuario) {
        return false;
    }

    private void cargarMuro() {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(MarketplaceApplication.class.getResource("Muro.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = (Stage) usuarioTextField.getScene().getWindow(); // Obtener la ventana actual
            stage.setScene(scene);
            stage.setTitle("Muro del Usuario");
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de excepciones
        }
    }

    private void cargarRegistro() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MarketplaceApplication.class.getResource("Registro.fxml")); // Asegúrate de que el nombre de tu archivo es correcto
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = (Stage) usuarioTextField.getScene().getWindow(); // Obtener la ventana actual
            stage.setScene(scene);
            stage.setTitle("Registro de Usuario");
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de excepciones
        }
    }
}

