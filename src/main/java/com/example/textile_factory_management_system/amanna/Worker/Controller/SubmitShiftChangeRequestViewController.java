package com.example.textile_factory_management_system.amanna.Worker.Controller;

import com.example.textile_factory_management_system.NonUser.ShiftChangeRequest;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

public class SubmitShiftChangeRequestViewController
{
    @javafx.fxml.FXML
    private Text submitShiftChangeRequestLabel;
    @javafx.fxml.FXML
    private TableColumn<ShiftChangeRequest,String> newShiftTimeTC;
    @javafx.fxml.FXML
    private TableColumn<ShiftChangeRequest,Integer> scheduledIdTC;
    @javafx.fxml.FXML
    private TableColumn<ShiftChangeRequest,String> oldShiftTimeTC;
    @javafx.fxml.FXML
    private TableView<ShiftChangeRequest> shiftChangeRequestTv;
    @javafx.fxml.FXML
    private TableColumn<ShiftChangeRequest,Integer> workerIdTC;
    @javafx.fxml.FXML
    private Label label;

    @javafx.fxml.FXML
    public void initialize() {
        newShiftTimeTC.setCellValueFactory(new PropertyValueFactory<ShiftChangeRequest,String>("newShiftTime"));
        scheduledIdTC.setCellValueFactory(new PropertyValueFactory<ShiftChangeRequest,Integer>("scheduledId"));
        oldShiftTimeTC.setCellValueFactory(new PropertyValueFactory<ShiftChangeRequest,String>("oldShiftTime"));
        workerIdTC.setCellValueFactory(new PropertyValueFactory<ShiftChangeRequest,Integer>("workerId"));

    }

    @Deprecated
    public void requestChangeButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void changeRequestButtonOA(ActionEvent actionEvent) {
    }
}