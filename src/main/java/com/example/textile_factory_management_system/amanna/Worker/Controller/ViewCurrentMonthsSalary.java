package com.example.textile_factory_management_system.amanna.Worker.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class ViewCurrentMonthsSalary
{

    @javafx.fxml.FXML
    private TableView<PAyroll> currentMonthSalaryTV;
    @javafx.fxml.FXML
    private TableColumn<Payroll,Float> baseRateTc;
    @javafx.fxml.FXML
    private TableColumn<Payroll,Float> netPayTC;
    @javafx.fxml.FXML
    private TableColumn BonusAmountTC;
    @javafx.fxml.FXML
    private TextField payrollIdTf;
    @javafx.fxml.FXML
    private ComboBox<Payroll> monthCB;
    @javafx.fxml.FXML
    private TableColumn<Payroll,Float> overtimeHoursTc;
    @javafx.fxml.FXML
    private Text viewCurrentMonthSalaryLabel;
    @javafx.fxml.FXML
    private TextField employeeIdTF;

    @javafx.fxml.FXML
    public void initialize() {
        monthCB.getItems().addAll("January","February","March","April","May","June","July","August","September","October","November","December");
    }


}