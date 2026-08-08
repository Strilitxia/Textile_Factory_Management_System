package com.example.textile_factory_management_system.asif.ProductionManager.Controller;

import com.example.textile_factory_management_system.asif.ProductionManager.Model.ProductionManager;
import com.example.textile_factory_management_system.utility.AlertHelper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ProdManG8Controller {
    @javafx.fxml.FXML
    private ComboBox<String> selectMaterialTypeComboBox;
    @javafx.fxml.FXML
    private TextField materialAmountTF;

    @FXML
    public void initialize() {
        selectMaterialTypeComboBox.getItems().addAll("Cloth", "Thread", "Color", "Button");
    }

    @javafx.fxml.FXML
    public void materialRequestButtonOA(ActionEvent actionEvent) {
        if (ProductionManager.submitMaterialRequisition(selectMaterialTypeComboBox.getValue(), Float.parseFloat(materialAmountTF.getText()))) {
            AlertHelper.showInfo("Requisition placed.");
        } else {
            AlertHelper.showError("Some error occurred!");
        }
    }
}
