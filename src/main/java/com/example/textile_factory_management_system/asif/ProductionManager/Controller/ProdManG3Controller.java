package com.example.textile_factory_management_system.asif.ProductionManager.Controller;

import com.example.textile_factory_management_system.NonUser.ProductionBatch;
import com.example.textile_factory_management_system.NonUser.ProductionOutput;
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

public class ProdManG3Controller {
    @javafx.fxml.FXML
    private ComboBox<Integer> selectProductionBatchComboBox;
    @javafx.fxml.FXML
    private TextField usableCountTF;
    @javafx.fxml.FXML
    private TableColumn<ProductionOutput, Integer> defectCountTC;
    @javafx.fxml.FXML
    private TableView<ProductionOutput> productionBatchTV;
    @javafx.fxml.FXML
    private TextField totalProducedTF;
    @javafx.fxml.FXML
    private TableColumn<ProductionOutput, Integer> targetQuantityTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionOutput, Integer> batchId;
    @javafx.fxml.FXML
    private TextField defectCountTF;
    @javafx.fxml.FXML
    private TableColumn<ProductionOutput, Integer> totalProducedTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionOutput, Integer> usableCountTC;

    @FXML
    public void initialize() {
        batchId.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        targetQuantityTC.setCellValueFactory(new PropertyValueFactory<>("targetQuantity"));
        totalProducedTC.setCellValueFactory(new PropertyValueFactory<>("totalProduced"));
        defectCountTC.setCellValueFactory(new PropertyValueFactory<>("defectCount"));
        usableCountTC.setCellValueFactory(new PropertyValueFactory<>("usableCount"));

        ObservableList<ProductionBatch> pdb = FileReadWrite.loadData(ProductionBatch.class, "ProductionBatches.bin");
        for (ProductionBatch p : pdb) {
            if ("Incomplete".equals(p.getCompleteStatus())) {
                selectProductionBatchComboBox.getItems().add(p.getBatchId());
            }
        }
    }

    @javafx.fxml.FXML
    public void loadBatchInfoButtonOA(ActionEvent actionEvent) {
        Integer selectedBatch = selectProductionBatchComboBox.getValue();
        if (selectedBatch == null) return;

        ObservableList<ProductionOutput> outputs = FileReadWrite.loadData(ProductionOutput.class, "ProductionOutputs.bin");
        ProductionOutput existingOutput = null;

        for (ProductionOutput po : outputs) {
            if (po.getBatchId() == selectedBatch) {
                existingOutput = po;
                break;
            }
        }

        if (existingOutput != null) {
            productionBatchTV.getItems().setAll(existingOutput);
        } else {
            ProductionOutput newOutput = new ProductionOutput(
                    ProductionManager.generateProductionOutputID(),
                    selectedBatch,
                    0, 0, 0
            );
            FileReadWrite.append(newOutput, "ProductionOutputs.bin");
            AlertHelper.showInfo("Production Output Not found, A blank ID created");
            productionBatchTV.getItems().setAll(newOutput);
        }
    }
}