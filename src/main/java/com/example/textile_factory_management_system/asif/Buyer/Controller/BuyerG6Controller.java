package com.example.textile_factory_management_system.asif.Buyer.Controller;


import com.example.textile_factory_management_system.NonUser.Invoice;
import com.example.textile_factory_management_system.asif.Buyer.Model.Buyer;
import com.example.textile_factory_management_system.utility.AlertHelper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BuyerG6Controller {
    @javafx.fxml.FXML
    private Label downloadStatusLabel;
    @FXML
    private TextField completedOrderIdTF;


    @FXML
    public void loadOrderButtonOA(ActionEvent actionEvent) {
        int givenID = Integer.parseInt(completedOrderIdTF.getText());
        Invoice output = Buyer.viewInvoice(givenID);

        if (output == null){
            AlertHelper.showError("Invoice not found.");
        } else{
            downloadStatusLabel.setText(output.toString());
        }
    }
}
