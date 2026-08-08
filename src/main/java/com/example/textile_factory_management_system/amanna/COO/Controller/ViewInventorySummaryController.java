package com.example.textile_factory_management_system.amanna.COO.Controller;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.time.LocalDate;

public class ViewInventorySummaryController
{
    @javafx.fxml.FXML
    private TableView <RawMaterial>inventorysummaryTV;
    @javafx.fxml.FXML
    private TableColumn<RawMaterial,Integer> materialIdTC;
    @javafx.fxml.FXML
    private Text inventorysummaryLabel;
    @javafx.fxml.FXML
    private TableColumn<RawMaterial, LocalDate> validityTC;
    @javafx.fxml.FXML
    private TableColumn<RawMaterial,String> materialNameTC;
    @javafx.fxml.FXML
    private TableColumn<RawMaterail,Integer> unitPriceTC;
    @javafx.fxml.FXML
    private TableColumn<RawMaterial,Integer>stockQuantityTc;

    @javafx.fxml.FXML
    public void initialize() {
        materialIdTC.setCellValueFactory(new PropertyValueFactory<RawMaterial,Integer>("materialId"));
        validityTC.setCellValueFactory(new PropertyValueFactory<RawMaterial,LocalDate>("validity"));
        materialNameTC.setCellValueFactory(new PropertyValueFactory<RawMaterial,String>("materialName"));
        unitPriceTC.setCellValueFactory(new PropertyValueFactory<RawMaterial,Integer>("unitPrice"));
        stockQuantityTc.setCellValueFactory((new PropertyValueFactory<RawMaterial,Integer>("stockQuantity")));


    }}