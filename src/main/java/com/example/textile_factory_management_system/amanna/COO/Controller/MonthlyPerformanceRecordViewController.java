package com.example.textile_factory_management_system.amanna.COO.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class MonthlyPerformanceRecordViewController
{
    @javafx.fxml.FXML
    private TextField numberOfOrdersTF;
    @javafx.fxml.FXML
    private Text monthlyPerformanceReportLabel;
    @javafx.fxml.FXML
    private TextField monthTF;
    @javafx.fxml.FXML
    private TextField productionBatchesTF;
    @javafx.fxml.FXML
    private TextField workersonLeaveTF;
    @javafx.fxml.FXML
    private TextField quotationReceivedTF;
    @javafx.fxml.FXML
    private ComboBox selesctMontCB;
    @javafx.fxml.FXML
    private ComboBox selesctYearCB;

    @javafx.fxml.FXML
    public void initialize() {
        selectYearCB.getItems().addAll("2023","2024","2025","2026");
        selesctMonthCB.getItems().addAll("January","February","March","April","May","June","July","August","September","October","November","December");

    }

    @javafx.fxml.FXML
    public void enterButtonOA(ActionEvent actionEvent) {
    }
}