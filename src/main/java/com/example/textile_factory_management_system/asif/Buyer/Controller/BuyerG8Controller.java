package com.example.textile_factory_management_system.asif.Buyer.Controller;

import com.example.textile_factory_management_system.NonUser.Product;
import com.example.textile_factory_management_system.asif.Buyer.Model.Buyer;
import com.example.textile_factory_management_system.utility.AlertHelper;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class BuyerG8Controller {
    @FXML
    private TextField commentTF;
    @FXML
    private ComboBox<Integer> selectRatingComboBox;
    @FXML
    private ComboBox<String> selectProductComboBox;
    @FXML
    private TextField customerIdTF;

    @FXML
    public void initialize() {
        ObservableList<Product> products = Buyer.browseProductCatalog();
        for (Product p : products) {
            selectProductComboBox.getItems().add(p.getProductType());
        }
        for (int i = 1; i <= 5; i++) {
            selectRatingComboBox.getItems().add(i);
        }
    }

    @FXML
    public void submitReviewButtonOA(ActionEvent actionEvent) {
        if (customerIdTF.getText().isBlank() || selectRatingComboBox.getValue()==null || selectProductComboBox.getValue()==null){
            AlertHelper.showError("Required field is missing");
        } else{
            if(Buyer.submitProductReview(selectProductComboBox.getValue(), Integer.parseInt(customerIdTF.getText()), selectRatingComboBox.getValue(),commentTF.getText())){
                AlertHelper.showInfo("Review added successfully");
            } else{
                AlertHelper.showError("An error has occurred");
            }
        }
    }
}
