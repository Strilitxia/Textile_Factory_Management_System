package com.example.textile_factory_management_system.asif.Buyer.Controller;

import com.example.textile_factory_management_system.asif.Buyer.Model.Buyer;
import com.example.textile_factory_management_system.utility.AlertHelper;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class BuyerG8Controller {
    @javafx.fxml.FXML
    private TextField commentTF;
    @javafx.fxml.FXML
    private ComboBox<Integer> selectRatingComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> selectProductComboBox;
    @javafx.fxml.FXML
    private TextField customerIdTF;

    @javafx.fxml.FXML
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
