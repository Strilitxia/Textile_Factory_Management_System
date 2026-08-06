package com.example.textile_factory_management_system.amanna.COO.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;

import java.time.LocalDate;

public class ApproveLargeProductionOrderController
{
    @javafx.fxml.FXML
    private TableColumn<LargeOrder, LocalDate> scheduleDateTC;
    @javafx.fxml.FXML
    private ComboBox<String> selectactionCB;
    @javafx.fxml.FXML
    private TableColumn<LargeOrder, String> productTypeTC;
    @javafx.fxml.FXML
    private TableView productionOrderTV;
    @javafx.fxml.FXML
    private Text largeProductionOrderLabel;
    @javafx.fxml.FXML
    private TableColumn<LargeOrder,Integer> orderIdTC;
    @javafx.fxml.FXML
    private TableColumn<LargeOrder,Integer> customerIdTc;
    @javafx.fxml.FXML
    private ComboBox<String> selectOrderCB;

    @javafx.fxml.FXML
    public void initialize() {
        selectactionCB.getItems().addAll("approve","Reject");
        selectOrderCB.getItems().addAll();

    }

    @javafx.fxml.FXML
    public void applyButtonOA(ActionEvent actionEvent) {
    }
}