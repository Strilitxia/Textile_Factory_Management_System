package com.example.textile_factory_management_system.amanna.Worker.Controller;

import com.example.textile_factory_management_system.NonUser.ProductionTask;
import com.example.textile_factory_management_system.User;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

public class ViewDailyProductionTaskQuataController
{
    @javafx.fxml.FXML
    private Text viewDailyProductionTaskQuata;
    @javafx.fxml.FXML
    private TableView<ProductionTask> tableViewTV;
    @javafx.fxml.FXML
    private TableColumn<ProductionTask,Integer> taskViewTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionTask, User> assignedToTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionTask,String> descriptionTC;

    @javafx.fxml.FXML
    public void initialize() {
        assignedToTC.setCellValueFactory(new PropertyValueFactory<>("assignedTo"));
        descriptionTC.setCellValueFactory(new PropertyValueFactory<>("description"));
        taskViewTC.setCellValueFactory(new PropertyValueFactory<>("taskView"));
    }

    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {
        tableViewTV.getItems().clear();

    }
}