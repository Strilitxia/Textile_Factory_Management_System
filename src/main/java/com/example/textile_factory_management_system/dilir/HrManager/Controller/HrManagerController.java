package com.example.textile_factory_management_system.dilir.HrManager.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class HrManagerController {
    @javafx.fxml.FXML
    private Label welcomeLabel;
    @javafx.fxml.FXML
    private VBox contentContainer;

    private static final String FXML_BASE_PATH = "/com/example/textile_factory_management_system/dilir/HrManager/";

    @javafx.fxml.FXML
    public void initialize() {
        welcomeLabel.setText("Welcome, HR Manager!");
    }

    private void loadFXMLView(String fxmlFilename) {
        try {
            String path = FXML_BASE_PATH + fxmlFilename;
            FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
            Node view = loader.load();
            contentContainer.getChildren().clear();
            contentContainer.getChildren().add(view);

        } catch (IOException e) {
            e.printStackTrace();
            // Display error message in the content area itself
            contentContainer.getChildren().clear();
            contentContainer.getChildren().add(new Label("Error: Could not load component view " + fxmlFilename + ". Check the file path and FXML structure."));
        }
    }

    @javafx.fxml.FXML
    public void workerRoleAssignmentButton(ActionEvent actionEvent) {
        loadFXMLView("WorkerRoleAssignment.fxml");
    }

    @javafx.fxml.FXML
    public void leaveApprovalsButton(ActionEvent actionEvent) {
        loadFXMLView("LeaveApprovals.fxml");
    }

    @javafx.fxml.FXML
    public void addNewWorkerButton(ActionEvent actionEvent) {
        loadFXMLView("AddNewWorker.fxml");
    }

    @javafx.fxml.FXML
    public void workerEvaluationReportsButton(ActionEvent actionEvent) {
        loadFXMLView("WorkerEvaluationReports.fxml");
    }

    @javafx.fxml.FXML
    public void promotionEvaluationsButton(ActionEvent actionEvent) {
        loadFXMLView("PromotionEvaluations.fxml");
    }

    @javafx.fxml.FXML
    public void payrollProcessingAndDistributionButton(ActionEvent actionEvent) {
        loadFXMLView("PayrollProcessing&Distribution.fxml");
    }

    @javafx.fxml.FXML
    public void workerAttendanceButton(ActionEvent actionEvent) {
        loadFXMLView("ViewWorkerAttendance.fxml");
    }

    @javafx.fxml.FXML
    public void resolveWorkerComplaintsButton(ActionEvent actionEvent) {
        loadFXMLView("ResolveWorkerComplaints.fxml");
    }
}