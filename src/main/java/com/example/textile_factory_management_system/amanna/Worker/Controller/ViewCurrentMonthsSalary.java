package com.example.textile_factory_management_system.amanna.Worker.Controller;

import com.example.textile_factory_management_system.NonUser.Payroll;
import com.example.textile_factory_management_system.amanna.Worker.Model.Worker;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

public class ViewCurrentMonthsSalary
{

    @javafx.fxml.FXML
    private TableView<Payroll> currentMonthSalaryTV;
    @javafx.fxml.FXML
    private TableColumn<Payroll,Float> baseRateTc;
    @javafx.fxml.FXML
    private TableColumn<Payroll,Float> netPayTC;
    @javafx.fxml.FXML
    private TableColumn<Payroll, Float> BonusAmountTC;
    @javafx.fxml.FXML
    private ComboBox<String> monthCB;
    @javafx.fxml.FXML
    private TableColumn<Payroll,Float> overtimeHoursTc;
    @javafx.fxml.FXML
    private Text viewCurrentMonthSalaryLabel;

    @javafx.fxml.FXML
    public void initialize() {
        monthCB.getItems().addAll("January","February","March","April","May","June","July","August","September","October","November","December");
        baseRateTc.setCellValueFactory(new PropertyValueFactory<>("baserate"));
        netPayTC.setCellValueFactory(new PropertyValueFactory<>("netPay"));
        overtimeHoursTc.setCellValueFactory(new PropertyValueFactory<>("overtimeHours"));
        BonusAmountTC.setCellValueFactory(new PropertyValueFactory<>("bonusAmount"));
    }


    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {
        currentMonthSalaryTV.setItems(null);
        currentMonthSalaryTV.getItems().add(Worker.loadCurrentMonthSalary(monthCB.getValue()));
    }
}