package com.example.textile_factory_management_system.asif.ProductionManager.Controller;

import com.example.textile_factory_management_system.NonUser.ProductionBatch;
import com.example.textile_factory_management_system.utility.FileReadWrite;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProdManG3Controller {
    @javafx.fxml.FXML
    private ComboBox<Integer> selectProductionBatchComboBox;
    @javafx.fxml.FXML
    private TableColumn<ProductionBatch, Integer> defectCountTC;
    @javafx.fxml.FXML
    private TableView<ProductionBatch> productionBatchTV;
    @javafx.fxml.FXML
    private TableColumn<ProductionBatch, Integer> targetQuantityTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionBatch, Integer> batchId;
    @javafx.fxml.FXML
    private TableColumn<ProductionBatch, Integer> totalProducedTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionBatch, Integer> usableCountTC;

    @FXML
    public void initialize() {
        batchId.setCellValueFactory(new PropertyValueFactory<>("batchId"));
        targetQuantityTC.setCellValueFactory(new PropertyValueFactory<>("targetQuantity"));
        totalProducedTC.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        defectCountTC.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        usableCountTC.setCellValueFactory(new PropertyValueFactory<>("targetId"));

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

        productionBatchTV.getItems().clear();
        ObservableList<ProductionBatch> batches = FileReadWrite.loadData(ProductionBatch.class, "ProductionBatches.bin");
        for (ProductionBatch b : batches) {
            if (b.getBatchId() == selectedBatch) {
                productionBatchTV.getItems().add(b);
                break;
            }
        }
    }
}