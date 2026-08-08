package com.example.textile_factory_management_system.amanna.COO.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

public class ViewSalesSummaryController
{
    @javafx.fxml.FXML
    private TableColumn <ProductionOutput,Integer>productionOutputIdTc;
    @javafx.fxml.FXML
    private TableView<ProductionOutput> salesSummaryTV;
    @javafx.fxml.FXML
    private DatePicker endDateDP;
    @javafx.fxml.FXML
    private TableColumn<ProductionOutput,Integer> batchIdTc;
    @javafx.fxml.FXML
    private Text salesSummaryLabel;
    @javafx.fxml.FXML
    private DatePicker satartDateDP;
    @javafx.fxml.FXML
    private TableColumn<ProductionOutput,Integer> totalProducedTC;

    @javafx.fxml.FXML
    public void initialize() {
        productionOutputIdTc.setCellValueFactory(new PropertyValueFactory<ProductionOutput,Integer>(""));
        batchIdTc.setCellValueFactory(new PropertyValueFactory<ProductionOutput,Integer>(""));
        totalProducedTC.setCellValueFactory(new PropertyValueFactory<ProductionOutput,Integer>(""));

    }

    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {
    }
}