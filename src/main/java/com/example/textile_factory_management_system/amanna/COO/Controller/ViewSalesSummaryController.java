package com.example.textile_factory_management_system.amanna.COO.Controller;

import com.example.textile_factory_management_system.NonUser.Order;
import com.example.textile_factory_management_system.amanna.COO.Model.COO;
import com.example.textile_factory_management_system.utility.AlertHelper;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.time.LocalDate;

public class ViewSalesSummaryController
{
    @javafx.fxml.FXML
    private TableView<Order> salesSummaryTV;
    @javafx.fxml.FXML
    private DatePicker endDateDP;
    @javafx.fxml.FXML
    private Text salesSummaryLabel;
    @javafx.fxml.FXML
    private DatePicker satartDateDP;
    @javafx.fxml.FXML
    private TableColumn<Order, LocalDate> scheduleDateTC;
    @javafx.fxml.FXML
    private TableColumn<Order, String> productTypeTC;
    @javafx.fxml.FXML
    private TableColumn<Order, String> statusTC;
    @javafx.fxml.FXML
    private TableColumn<Order, Integer> orderIDTC;
    @javafx.fxml.FXML
    private TableColumn<Order, Integer> customerIDTC;

    @javafx.fxml.FXML
    public void initialize() {
        productTypeTC.setCellValueFactory(new PropertyValueFactory<>("productType"));
        scheduleDateTC.setCellValueFactory(new PropertyValueFactory<>("scheduleDate"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        customerIDTC.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        orderIDTC.setCellValueFactory(new PropertyValueFactory<>("orderId"));
    }

    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {
        if (satartDateDP.getValue() == null || endDateDP.getValue() == null){
            AlertHelper.showError("Enter both start and end date!");
            return;
        }
        if ((satartDateDP.getValue().isAfter(endDateDP.getValue())) || (endDateDP.getValue().isBefore(satartDateDP.getValue()))){
            AlertHelper.showError("Enter valid dates!");
            return;
        }
        salesSummaryTV.getItems().clear();
        try {
            salesSummaryTV.getItems().addAll(COO.viewSalesSummary(satartDateDP.getValue(), endDateDP.getValue()));
        } catch (Exception e) {
            AlertHelper.showError("Error!");
        }
    }
}
