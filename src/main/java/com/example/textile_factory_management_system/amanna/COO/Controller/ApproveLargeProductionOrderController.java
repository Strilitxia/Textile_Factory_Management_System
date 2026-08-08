package com.example.textile_factory_management_system.amanna.COO.Controller;

import com.example.textile_factory_management_system.NonUser.LargeOrder;
import com.example.textile_factory_management_system.amanna.COO.Model.COO;
import com.example.textile_factory_management_system.utility.AlertHelper;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private TableView<LargeOrder> productionOrderTV;
    @javafx.fxml.FXML
    private Text largeProductionOrderLabel;
    @javafx.fxml.FXML
    private TableColumn<LargeOrder,Integer> orderIdTC;
    @javafx.fxml.FXML
    private TableColumn<LargeOrder,Integer> customerIdTc;
    @javafx.fxml.FXML
    private ComboBox<Integer> selectOrderCB;

    @javafx.fxml.FXML
    public void initialize() {
        selectactionCB.getItems().addAll("Approve","Reject");

        customerIdTc.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        orderIdTC.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        productTypeTC.setCellValueFactory(new PropertyValueFactory<>("productType"));
        scheduleDateTC.setCellValueFactory(new PropertyValueFactory<>("scheduleDate"));

        ObservableList<LargeOrder> largeOrders = COO.loadAllLargeOrders();
        productionOrderTV.setItems(largeOrders);
        for (LargeOrder lo:largeOrders) {
            selectOrderCB.getItems().add(lo.getOrderId());
        }
    }

    @javafx.fxml.FXML
    public void applyButtonOA(ActionEvent actionEvent) {
        if (COO.approveRejectLargeOrders(selectOrderCB.getValue(), selectactionCB.getValue())){
            AlertHelper.showInfo("Status Updated.");
        } else {
            AlertHelper.showError("An error occurred.");
        }
    }
}