package com.example.textile_factory_management_system.amanna.COO.Controller;

import javafx.scene.control.DatePicker;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.time.LocalDate;

public class SetProductionTargetViewController
{
    @javafx.fxml.FXML
    private TableColumn<ProductionTarget,Integer> targetIdTc;
    @javafx.fxml.FXML
    private TableView <productionTarget>setProductionTV;
    @javafx.fxml.FXML
    private TableColumn<ProductionTarget,String> productTypeTC;
    @javafx.fxml.FXML
    private TextField numericalAmountTF;
    @javafx.fxml.FXML
    private DatePicker<ProductionTarget, LocalDate> deadlineDp;
    @javafx.fxml.FXML
    private Text succesLabel;
    @javafx.fxml.FXML
    private Text setProductionTargetLabel;
    @javafx.fxml.FXML
    private TableColumn<ProductuctionTarget,Integer> targetamountTC;

    @javafx.fxml.FXML
    public void initialize() {
        targetIdTc.setCellValueFactory(new PropertyValueFactory<ProductionTarget,Integer>("targetId"));
        productTypeTC.setCellValueFactory(new PropertyValueFactory<ProductionTarget,String>("productType"));
        targetamountTC.setCellValueFactory(new PropertyValueFactory<ProductionTarget,Integer>("targetamount"));



    }}