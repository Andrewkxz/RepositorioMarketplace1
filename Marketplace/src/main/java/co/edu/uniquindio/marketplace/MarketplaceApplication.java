package co.edu.uniquindio.marketplace;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MarketplaceApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MarketplaceApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Marketplace Login");
        stage.setScene(scene);
        stage.show();


        /*FXMLLoader fxmlLoader = new FXMLLoader(MarketplaceApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setScene(scene);
        stage.setTitle("Marketplace");
        stage.show();*/
    }

    public static void main(String[] args) {
        launch();
    }
}
