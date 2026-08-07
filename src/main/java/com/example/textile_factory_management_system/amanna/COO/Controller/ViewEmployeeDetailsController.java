package com.example.textile_factory_management_system.amanna.COO.Controller;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;;

public class ViewEmployeeDetailsController
{
    @javafx.fxml.FXML
    private TableView viewEmployeeDetailsTV;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> roleTC;
    @javafx.fxml.FXML
    private TableColumn <Employee,Float>salaryTC;
    @javafx.fxml.FXML
    private TableColumn <Employee,String> remarksTC;
    @javafx.fxml.FXML
    private Text viewEmployeeDetailsLabel;
    @javafx.fxml.FXML
    private TextField employeeNameTf;
    @javafx.fxml.FXML
    private TableColumn<Employee,Float> performanceScoreTc;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> depertmentTC;
    @javafx.fxml.FXML
    private TextField employeeIdTF;

    @javafx.fxml.FXML
    public void initialize() {
        roleTC.setCellValueFactory(new PropertyValueFactory<Employee,String>(""));
        salaryTC.setCellValueFactory(new PropertyValueFactory<Employee,Float>(""));
        remarksTC.setCellValueFactory(new PropertyValueFactory<Employee,String>(""));
        performanceScoreTc.setCellValueFactory(new PropertyValueFactory<Employee,Float>(""));
        depertmentTC.setCellValueFactory(new PropertyValueFactory<Employee,String>(""));
    }}