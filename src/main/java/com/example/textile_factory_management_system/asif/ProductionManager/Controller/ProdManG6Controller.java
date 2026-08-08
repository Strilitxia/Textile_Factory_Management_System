package com.example.textile_factory_management_system.asif.ProductionManager.Controller;

import com.example.textile_factory_management_system.NonUser.ProductionBatch;
import com.example.textile_factory_management_system.NonUser.ProductionOutput;
import com.example.textile_factory_management_system.asif.ProductionManager.Model.ProductionManager;
import com.example.textile_factory_management_system.utility.AlertHelper;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProdManG6Controller {
    @javafx.fxml.FXML
    private ComboBox<Integer> selectProductionBatchComboBox;
    @javafx.fxml.FXML
    private TextField usableCountTF;
    @javafx.fxml.FXML
    private TableColumn<ProductionOutput,Integer> defectCountTC;
    @javafx.fxml.FXML
    private TableView<ProductionOutput> batchInfoTV;
    @javafx.fxml.FXML
    private TableColumn<ProductionOutput,Integer> outputIdTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionOutput,Integer> batchIdTC;
    @javafx.fxml.FXML
    private TextField productQuantityTF;
    @javafx.fxml.FXML
    private TextField defectCountTF;
    @javafx.fxml.FXML
    private TableColumn<ProductionOutput,Integer> totalProducedTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionOutput,Integer> usableCountTC;

    @javafx.fxml.FXML
    public void initialize(){
        batchIdTC.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        outputIdTC.setCellValueFactory(new PropertyValueFactory<>("outputId"));
        totalProducedTC.setCellValueFactory(new PropertyValueFactory<>("totalProduced"));
        defectCountTC.setCellValueFactory(new PropertyValueFactory<>("defectCount"));
        usableCountTC.setCellValueFactory(new PropertyValueFactory<>("usableCount"));

        ObservableList<ProductionBatch> batches = ProductionManager.viewAllProductionBatches();
        selectProductionBatchComboBox.getItems().clear();
        for (ProductionBatch b : batches) {
            selectProductionBatchComboBox.getItems().add(b.getBatchId());
        }
    }

    @javafx.fxml.FXML
    public void loadBatchInfoButtonOA(ActionEvent actionEvent) {
        Integer selectedBatchId = selectProductionBatchComboBox.getValue();
        if (selectedBatchId == null) {
            AlertHelper.showError("Select a production batch from the combo box first.");
            return;
        }
        batchInfoTV.getItems().clear();
        ProductionOutput existing = ProductionManager.viewProductionOutput(selectedBatchId);
        if (existing != null) {
            batchInfoTV.getItems().add(existing);
            productQuantityTF.setText(String.valueOf(existing.getTotalProduced()));
            defectCountTF.setText(String.valueOf(existing.getDefectCount()));
            usableCountTF.setText(String.valueOf(existing.getUsableCount()));
        } else {
            AlertHelper.showInfo("No output recorded yet for batch " + selectedBatchId + ". Enter values and click Update.");
            productQuantityTF.clear();
            defectCountTF.clear();
            usableCountTF.clear();
        }
    }

    @javafx.fxml.FXML
    public void updateBatchOutputButtonOA(ActionEvent actionEvent) {
        Integer selectedBatchId = selectProductionBatchComboBox.getValue();
        if (selectedBatchId == null) {
            AlertHelper.showError("Select a production batch first.");
            return;
        }
        try {
            int totalProduced = Integer.parseInt(productQuantityTF.getText());
            int defectCount = Integer.parseInt(defectCountTF.getText());
            int usableCount = Integer.parseInt(usableCountTF.getText());

            if (ProductionManager.recordProductionOutput(selectedBatchId, totalProduced, defectCount, usableCount)) {
                AlertHelper.showInfo("Output recorded for batch " + selectedBatchId + ".");
                loadBatchInfoButtonOA(actionEvent);
            } else {
                AlertHelper.showError("Could not record the production output.");
            }
        } catch (NumberFormatException e) {
            AlertHelper.showError("Produced Quantity, Defect Count and Usable Count must be integers.");
        }
    }
}
