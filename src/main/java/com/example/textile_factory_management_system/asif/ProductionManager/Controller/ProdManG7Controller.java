package com.example.textile_factory_management_system.asif.ProductionManager.Controller;

import com.example.textile_factory_management_system.amanna.Worker.Model.Worker;
import com.example.textile_factory_management_system.asif.ProductionManager.Model.ProductionManager;
import com.example.textile_factory_management_system.utility.AlertHelper;
import com.example.textile_factory_management_system.utility.FileReadWrite;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProdManG7Controller {
    @javafx.fxml.FXML
    private TableView<Worker> workerScheduleTV;
    @javafx.fxml.FXML
    private ComboBox<Integer> selectWorkerComboBox;
    @javafx.fxml.FXML
    private TableColumn<Worker, String> dailyTimeTC;
    @javafx.fxml.FXML
    private TableColumn<Worker, Integer> workerIdTC;
    @javafx.fxml.FXML
    private TableColumn<Worker, String> shiftTimeTC;
    @FXML
    private ComboBox<String> dailyTimeCB;
    @FXML
    private ComboBox<String> shiftTimeCB;

    @FXML
    public void initialize() {
        dailyTimeCB.getItems().addAll("1 hour", "2 hours", "3 hours", "4 hours", "5 hours");
        shiftTimeCB.getItems().addAll("Morning (9AM-12PM)", "Afternoon (2PM-6PM)", "Evening (7PM-11PM)");

        dailyTimeTC.setCellValueFactory(new PropertyValueFactory<>("dailyTime"));
        shiftTimeTC.setCellValueFactory(new PropertyValueFactory<>("shiftTime"));
        workerIdTC.setCellValueFactory(new PropertyValueFactory<>("workerId"));

        workerScheduleTV.setItems(null);
        ObservableList<Worker> workers = ProductionManager.loadAllWorkers();
        workerScheduleTV.setItems(workers);
        for (Worker w:workers){
            selectWorkerComboBox.getItems().add(w.getUserId());
        }
    }

    @javafx.fxml.FXML
    public void assignScheduleButtonOA(ActionEvent actionEvent) {
        ObservableList<Worker> workers = ProductionManager.loadAllWorkers();
        for (int i = 0; i < workers.size(); i++){
            Worker w = workers.get(i);
            if (w.getUserId() == selectWorkerComboBox.getValue()){
                w.setDailyTime(dailyTimeCB.getValue());
                w.setShiftTime(shiftTimeCB.getValue());
                workers.set(i, w);
                FileReadWrite.saveData(workers, "Workers.bin");
                AlertHelper.showInfo("Schedule assigned successfully.");
            }
        }
    }
}
