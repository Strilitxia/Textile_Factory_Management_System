package com.example.textile_factory_management_system.asif.ProductionManager.Controller;

import com.example.textile_factory_management_system.NonUser.Employee;
import com.example.textile_factory_management_system.NonUser.ProductionTask;
import com.example.textile_factory_management_system.asif.ProductionManager.Model.ProductionManager;
import com.example.textile_factory_management_system.utility.FileReadWrite;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProdManG4Controller {
    @javafx.fxml.FXML
    private TableColumn<ProductionTask,String> taskDescriptionTC;
    @javafx.fxml.FXML
    private ComboBox<Integer> selectWorkerComboBox;
    @javafx.fxml.FXML
    private TableColumn<ProductionTask,Integer> taskIdTC;
    @javafx.fxml.FXML
    private TableView<ProductionTask> workerTaskTV;
    @javafx.fxml.FXML
    private TableColumn<ProductionTask,Integer> workerIdTC;
    @javafx.fxml.FXML
    private TextField taskDescriptionTF;

    @FXML
    public void initialize(){
        taskDescriptionTC.setCellValueFactory(new PropertyValueFactory<>("description"));
        taskIdTC.setCellValueFactory(new PropertyValueFactory<>("TaskId"));
        workerIdTC.setCellValueFactory(new PropertyValueFactory<>("assignedTo"));

        ObservableList<Employee> emp = FileReadWrite.loadData(Employee.class,"Employees.bin");
        for (Employee e: emp){
            if (e.getRole().equals("worker")){
                selectWorkerComboBox.getItems().add(e.getEmployeeId());
            }
        }
    }

    @javafx.fxml.FXML
    public void assignTaskButtonOA(ActionEvent actionEvent) {
        ProductionTask pt = new ProductionTask(ProductionManager.generateTaskID(),selectWorkerComboBox.getValue(),taskDescriptionTF.getText());
        FileReadWrite.append(pt,"ProductionTasks.bin");
    }

    @javafx.fxml.FXML
    public void loadAssignedTaskOA(ActionEvent actionEvent) {
        ObservableList<ProductionTask> pdt = FileReadWrite.loadData(ProductionTask.class,"ProductionTasks.bin");
        workerTaskTV.getItems().clear();
        for (ProductionTask t: pdt){
            if (t.getAssignedTo() == selectWorkerComboBox.getValue()){
                workerTaskTV.getItems().add(t);
            }
        }
    }
}
