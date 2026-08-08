package com.example.textile_factory_management_system.amanna.COO.Controller;

import com.example.textile_factory_management_system.NonUser.ProductionTarget;
import com.example.textile_factory_management_system.amanna.COO.Model.COO;
import com.example.textile_factory_management_system.utility.AlertHelper;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import java.time.LocalDate;

public class SetProductionTargetViewController
{
    @javafx.fxml.FXML
    private Text succesLabel;
    @javafx.fxml.FXML
    private Text setProductionTargetLabel;
    @javafx.fxml.FXML
    private TextField productTypeTF;
    @javafx.fxml.FXML
    private DatePicker deadlineDP;
    @javafx.fxml.FXML
    private TextField targetAmountTF;

    @javafx.fxml.FXML
    public void createButtonOA(ActionEvent actionEvent) {
        if (targetAmountTF.getText().isBlank() || productTypeTF.getText().isBlank() || deadlineDP.getValue() == null) {
            AlertHelper.showError("Do not leave fields blank");
        } else {
            try {
                if (COO.setProductionTarget(productTypeTF.getText(), Integer.parseInt(targetAmountTF.getText()), deadlineDP.getValue())){
                    AlertHelper.showInfo("Target set successfully!");
                } else {
                    AlertHelper.showError("An error occurred!");
                }
            } catch (NumberFormatException e) {
                AlertHelper.showError("Target amount must be an integer!");
            }
        }
    }
}