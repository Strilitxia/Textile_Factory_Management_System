package com.example.textile_factory_management_system.amanna.COO.Controller;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

public class ViewProductionSummaryController
{
    @javafx.fxml.FXML
    private TableColumn<ProductionSummary,Integer> productionOutputIdTc;
    @javafx.fxml.FXML
    private TableColumn<ProductionSummary,Integer> batchIdTC;
    @javafx.fxml.FXML
    private Text productionSummaryLabel;
    @javafx.fxml.FXML
    private TableView<ProductionSummary> productionSummaryTV;
    @javafx.fxml.FXML
    private TableColumn<ProductionSummary,Integer> totalProducedTC;

    @javafx.fxml.FXML
    public void initialize() {
         productionOutputIdTc.setCellValueFactory(new PropertyValueFactory<ProductionSummary,Integer>(""));
         batchIdTC.setCellValueFactory(new PropertyValueFactory<ProductionSummary,Integer>("" ));
         totalProducedTC.setCellValueFactory(new PropertyValueFactory<Productionsummary,Integer>(""));
    }}