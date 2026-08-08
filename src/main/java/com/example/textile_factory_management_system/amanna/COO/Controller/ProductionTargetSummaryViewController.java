package com.example.textile_factory_management_system.amanna.COO.Controller;

import com.example.textile_factory_management_system.NonUser.ProductionTarget;
import com.example.textile_factory_management_system.amanna.COO.Model.COO;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.time.LocalDate;

public class ProductionTargetSummaryViewController
{
    @javafx.fxml.FXML
    private Text profitandlossSummaryLabel;
    @javafx.fxml.FXML
    private TableColumn<ProductionTarget, Integer> targetIDTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionTarget, LocalDate> deadlineTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionTarget, String> productTypeTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionTarget, Integer> completedQuotaTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionTarget, String> statusTC;
    @javafx.fxml.FXML
    private TableColumn<ProductionTarget, Integer> targetAmountTC;
    @javafx.fxml.FXML
    private TableView<ProductionTarget> productionTargetTV;

    @javafx.fxml.FXML
    public void initialize() {
        completedQuotaTC.setCellValueFactory(new PropertyValueFactory<>("completedQuota"));
        deadlineTC.setCellValueFactory(new PropertyValueFactory<>("deadline"));
        productTypeTC.setCellValueFactory(new PropertyValueFactory<>("productType"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        targetAmountTC.setCellValueFactory(new PropertyValueFactory<>("targetAmount"));
        targetIDTC.setCellValueFactory(new PropertyValueFactory<>("targetId"));

        productionTargetTV.setItems(COO.loadAllProductionTargets());
    }


}