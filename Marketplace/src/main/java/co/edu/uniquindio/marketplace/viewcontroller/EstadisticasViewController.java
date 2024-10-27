package co.edu.uniquindio.marketplace.viewcontroller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;

public class EstadisticasViewController {

    @FXML
    private PieChart pieChart;

    public void initialize() {
        cargarDatosPieChart();
    }

    private void cargarDatosPieChart() {
        ObservableList<PieChart.Data> datos = FXCollections.observableArrayList(
                new PieChart.Data("Categoría 1", 45),
                new PieChart.Data("Categoría 2", 35),
                new PieChart.Data("Categoría 3", 20)
        );

        pieChart.setData(datos);
    }
}