package com.example.textile_factory_management_system.asif.ProductionManager.Controller;

import com.example.textile_factory_management_system.NonUser.ShiftChangeRequest;
import com.example.textile_factory_management_system.asif.ProductionManager.Model.ProductionManager;
import com.example.textile_factory_management_system.utility.AlertHelper;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProdManG5Controller {
    @javafx.fxml.FXML
    private TableView<ShiftChangeRequest> shiftChangeTV;
    @javafx.fxml.FXML
    private TableColumn<ShiftChangeRequest,String> newShiftTimeTC;
    @javafx.fxml.FXML
    private TableColumn<ShiftChangeRequest,Integer> wrorkerIdTC;
    @javafx.fxml.FXML
    private TableColumn<ShiftChangeRequest,String> oldShiftTimeTC;

    @javafx.fxml.FXML
    public void initialize(){
        wrorkerIdTC.setCellValueFactory(new PropertyValueFactory<>("workerId"));
        oldShiftTimeTC.setCellValueFactory(new PropertyValueFactory<>("oldShiftTime"));
        newShiftTimeTC.setCellValueFactory(new PropertyValueFactory<>("newShiftTime"));
    }

    @javafx.fxml.FXML
    public void loadRequestButtonOA(ActionEvent actionEvent) {
        ObservableList<ShiftChangeRequest> pendingList = ProductionManager.viewShiftChangeRequests();
        shiftChangeTV.getItems().clear();
        for (ShiftChangeRequest r : pendingList) {
            if (!r.isApprove()) {
                shiftChangeTV.getItems().add(r);
            }
        }
    }

    @javafx.fxml.FXML
    public void approveNewWorkerScheduleButtonOA(ActionEvent actionEvent) {
        ShiftChangeRequest selected = shiftChangeTV.getSelectionModel().getSelectedItem();
        if (selected == null) {
            AlertHelper.showError("Select a request from the table first.");
            return;
        }
        if (ProductionManager.approveShiftChangeRequest(selected)) {
            AlertHelper.showInfo("Schedule approved for worker " + selected.getWorkerId() + ".");
        } else {
            AlertHelper.showError("Could not approve the request.");
        }
    }
}
