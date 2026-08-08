package com.example.textile_factory_management_system.asif.Buyer.Controller;

import com.example.textile_factory_management_system.NonUser.Product;
import com.example.textile_factory_management_system.asif.Buyer.Model.Buyer;
import com.example.textile_factory_management_system.utility.AlertHelper;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class BuyerG2Controller {
    @FXML
    private ComboBox<Integer> productTypeComboBox;
    @FXML
    private TextField bulkQuantityTF;
    @FXML
    private TextField customerIDTF;

    @FXML
    public void initialize() {
        ObservableList<Product> products = Buyer.browseProductCatalog();
        for (Product p : products) {
            productTypeComboBox.getItems().add(p.getProductId());
        }
    }

    @FXML
    public void sendQuotationRequestBuutonOA(ActionEvent actionEvent) {
        if (productTypeComboBox.getValue() == null || bulkQuantityTF.getText().isBlank() || Integer.parseInt(bulkQuantityTF.getText())<1){
            AlertHelper.showError("Enter all accepted values");
        } else{
            if (Buyer.submitRFQ(productTypeComboBox.getValue(), Float.parseFloat(bulkQuantityTF.getText()), Integer.parseInt(customerIDTF.getText()))){
                AlertHelper.showInfo("RFQ submitted successfully!");
            } else{
                AlertHelper.showError("An error occurred");
            }
        }
    }
}
