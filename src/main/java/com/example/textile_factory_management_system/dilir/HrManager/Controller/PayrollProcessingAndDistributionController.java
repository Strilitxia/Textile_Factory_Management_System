package com.example.textile_factory_management_system.dilir.HrManager.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PayrollProcessingAndDistributionController
{
    @javafx.fxml.FXML
    private ComboBox payrollComboBox;
    @javafx.fxml.FXML
    private TableColumn basePayCol;
    @javafx.fxml.FXML
    private TableView payrollTableView;
    @javafx.fxml.FXML
    private TableColumn overtimeCol;
    @javafx.fxml.FXML
    private TableColumn employeeCol;
    @javafx.fxml.FXML
    private TableColumn finalSalaryCol;
    @javafx.fxml.FXML
    private Label resultLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void runPayrollButtonOA(ActionEvent actionEvent) {
    }
}