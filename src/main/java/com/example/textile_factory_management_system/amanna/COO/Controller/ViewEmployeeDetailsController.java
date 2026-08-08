package com.example.textile_factory_management_system.amanna.COO.Controller;

import com.example.textile_factory_management_system.NonUser.Employee;
import com.example.textile_factory_management_system.amanna.COO.Model.COO;
import com.example.textile_factory_management_system.utility.AlertHelper;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

public class ViewEmployeeDetailsController
{
    @javafx.fxml.FXML
    private TableView<Employee> viewEmployeeDetailsTV;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> roleTC;
    @javafx.fxml.FXML
    private TableColumn <Employee,Float>salaryTC;
    @javafx.fxml.FXML
    private TableColumn <Employee,String> remarksTC;
    @javafx.fxml.FXML
    private Text viewEmployeeDetailsLabel;
    @javafx.fxml.FXML
    private TableColumn<Employee,Float> performanceScoreTc;
    @javafx.fxml.FXML
    private TextField employeeIdTF;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> departmentTC;

    @javafx.fxml.FXML
    public void initialize() {
        roleTC.setCellValueFactory(new PropertyValueFactory<Employee,String>("role"));
        salaryTC.setCellValueFactory(new PropertyValueFactory<Employee,Float>("salary"));
        remarksTC.setCellValueFactory(new PropertyValueFactory<Employee,String>("remarks"));
        performanceScoreTc.setCellValueFactory(new PropertyValueFactory<Employee,Float>("performanceScore"));
        departmentTC.setCellValueFactory(new PropertyValueFactory<Employee,String>("department"));
    }

    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {
        viewEmployeeDetailsTV.getItems().clear();
        try{
         viewEmployeeDetailsTV.getItems().addAll(COO.loadAllEmployees());
        } catch (Exception e) {
            AlertHelper.showError("Error!");
        }
    }
}