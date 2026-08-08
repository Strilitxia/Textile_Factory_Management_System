package com.example.textile_factory_management_system.amanna.COO.Controller;

import com.example.textile_factory_management_system.amanna.COO.Model.COO;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class MonthlyPerformanceRecordViewController
{
    @javafx.fxml.FXML
    private Text monthlyPerformanceReportLabel;
    @javafx.fxml.FXML
    private ComboBox<String> selesctMontCB;
    @javafx.fxml.FXML
    private ComboBox<Integer> selesctYearCB;
    @javafx.fxml.FXML
    private TextArea reportTA;

    @javafx.fxml.FXML
    public void initialize() {
        selesctYearCB.getItems().addAll(2023,2024,2025,2026);
        selesctMontCB.getItems().addAll("January","February","March","April","May","June","July","August","September","October","November","December");
    }

    @javafx.fxml.FXML
    public void enterButtonOA(ActionEvent actionEvent) {
        reportTA.setText(null);
        reportTA.setText(
                "MONTHLY PERFORMANCE REPORT"
                + "\n\n" + "Month: " + selesctMontCB.getValue()
                + COO.generateMonthlyPerformanceReport(selesctMontCB.getValue(), selesctYearCB.getValue())
        );
    }
}