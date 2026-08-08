package com.example.textile_factory_management_system.asif.ProductionManager.Controller;

import com.example.textile_factory_management_system.NonUser.ProductionTarget;
import com.example.textile_factory_management_system.asif.ProductionManager.Model.ProductionManager;
import com.example.textile_factory_management_system.utility.AlertHelper;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ProdManG2Controller {
    @javafx.fxml.FXML
    private TableColumn<ProductionTarget,Integer> targetIdTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionTarget,LocalDate> deadlineTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionTarget,String> productTypeTC;
    @javafx.fxml.FXML
    private TableView<ProductionTarget> viewProductionTargetTV;
    @javafx.fxml.FXML
    private TableColumn<ProductionTarget,Integer> completedQuotaTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionTarget,Integer> targetAmountTC;

    @FXML
    public void initialize(){
        completedQuotaTC.setCellValueFactory(new PropertyValueFactory<>("competedQuota"));
        productTypeTC.setCellValueFactory(new PropertyValueFactory<>("productType"));
        targetAmountTC.setCellValueFactory(new PropertyValueFactory<>("targetAmount"));
        targetIdTC.setCellValueFactory(new PropertyValueFactory<>("targetId"));
        deadlineTC.setCellValueFactory(new PropertyValueFactory<>("deadline"));
    }

    @javafx.fxml.FXML
    public void loadTargetButtonOA(ActionEvent actionEvent) {
        if (ProductionManager.viewAssignedProductionTarget().isEmpty()){
            AlertHelper.showError("No target has been assigned");
        } else{
            ObservableList<ProductionTarget> targetlist = ProductionManager.viewAssignedProductionTarget();
            viewProductionTargetTV.getItems().clear();
            for (ProductionTarget p : targetlist){
                viewProductionTargetTV.getItems().add(p);
            }
        }
    }
}
