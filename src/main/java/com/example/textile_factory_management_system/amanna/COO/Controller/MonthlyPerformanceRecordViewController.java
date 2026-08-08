package com.example.textile_factory_management_system.amanna.COO.Controller;

import javafx.scene.control.*;
import javafx.scene.text.Text;

public class MonthlyPerformanceRecordViewController
{
    @javafx.fxml.FXML
    private ComboBox <String> selesctMontCB;
    @javafx.fxml.FXML
    private TextField numberOfOrdersTF;
    @javafx.fxml.FXML
    private Text monthlyPerformanceReportLabel;
    @javafx.fxml.FXML
    private Button enterButtonOA;
    @javafx.fxml.FXML
    private TextField monthTF;
    @javafx.fxml.FXML
    private TextField productionBatchesTF;
    @javafx.fxml.FXML
    private TextField workersonLeaveTF;
    @javafx.fxml.FXML
    private TextField quotationReceivedTF;
    @javafx.fxml.FXML
    private ComboBox <String>  selectYearCB;

    @javafx.fxml.FXML
    public void initialize() {
        selectYearCB.getItems().addAll("");
        selectYearCB.getItems().addAll("");
    }}