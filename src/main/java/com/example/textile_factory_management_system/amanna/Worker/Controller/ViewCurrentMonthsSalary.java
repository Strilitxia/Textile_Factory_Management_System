package com.example.textile_factory_management_system.amanna.Worker.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class ViewCurrentMonthsSalary
{

    @javafx.fxml.FXML
    private TableView<PAyroll> currentMonthSalaryTV;
    @javafx.fxml.FXML
    private TableColumn baseRateTc;
    @javafx.fxml.FXML
    private TableColumn netPayTC;
    @javafx.fxml.FXML
    private TableColumn BonusAmountTC;
    @javafx.fxml.FXML
    private TextField payrollIdTf;
    @javafx.fxml.FXML
    private ComboBox monthCB;
    @javafx.fxml.FXML
    private TableColumn overtimeHoursTc;
    @javafx.fxml.FXML
    private Text viewCurrentMonthSalaryLabel;
    @javafx.fxml.FXML
    private TextField employeeIdTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void myPaySlipbuttonOA(ActionEvent actionEvent) {
    }
}