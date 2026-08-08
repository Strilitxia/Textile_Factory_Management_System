package com.example.textile_factory_management_system.asif.Buyer.Controller;

import com.example.textile_factory_management_system.NonUser.Order;
import com.example.textile_factory_management_system.asif.Buyer.Model.Buyer;
import com.example.textile_factory_management_system.utility.AlertHelper;
import com.example.textile_factory_management_system.utility.FileReadWrite;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class BuyerG7Controller {
    @javafx.fxml.FXML
    private ComboBox<String> selectBankComboBox;
    @javafx.fxml.FXML
    private ComboBox<Integer> orderComboBox;
    @javafx.fxml.FXML
    private TextField transactionIdTF;

    @FXML
    public void initialize() {
        selectBankComboBox.getItems().addAll("BRAC Bank Ltd.", "MTB", "Dhaka Bank", "Islami Bank");
        ObservableList<Order> orders = FileReadWrite.loadData(Order.class, "Orders.bin");
        for (Order order:orders) {
            orderComboBox.getItems().add(order.getOrderId());
        }
    }

    @javafx.fxml.FXML
    public void submitIdButtonOA(ActionEvent actionEvent) {
        if (transactionIdTF.getText().isBlank() || orderComboBox.getValue() == null || selectBankComboBox.getValue() == null) {
            AlertHelper.showError("Enter all fields properly!");
        } else {
            if (Buyer.submitTransactionReceipt(orderComboBox.getValue(), selectBankComboBox.getValue(), transactionIdTF.getText())) {
                AlertHelper.showInfo("Transaction ID submitted successfully!");
            } else {
                AlertHelper.showError("An error occurred!");
            }
        }
    }
}
