package com.example.textile_factory_management_system.amanna.COO.Controller;

import com.example.textile_factory_management_system.NonUser.ProductionOutput;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

public class ViewProductionSummaryController
{
    @javafx.fxml.FXML
    private TableColumn<ProductionOutput,Integer> productionOutputIdTc;
    @javafx.fxml.FXML
    private TableColumn<ProductionOutput,Integer> batchIdTC;
    @javafx.fxml.FXML
    private Text productionSummaryLabel;
    @javafx.fxml.FXML
    private TableView<ProductionOutput> productionSummaryTV;
    @javafx.fxml.FXML
    private TableColumn<ProductionOutput,Integer> totalProducedTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionOutput,Integer> defectCountTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionOutput,Integer> useableCountTc;

    @javafx.fxml.FXML
    public void initialize() {
         productionOutputIdTc.setCellValueFactory(new PropertyValueFactory<>("productionOutputId"));
         batchIdTC.setCellValueFactory(new PropertyValueFactory<>("batchId" ));
         totalProducedTC.setCellValueFactory(new PropertyValueFactory<>("totalProduced"));
         defectCountTC.setCellValueFactory(new PropertyValueFactory<>("defectCount"));
         useableCountTc.setCellValueFactory(new PropertyValueFactory<>("useableCount"));
    }
}