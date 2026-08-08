package com.example.textile_factory_management_system.amanna.COO.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class COOViewController {
    @javafx.fxml.FXML
    private Label welcomeLabel;
    @javafx.fxml.FXML
    private VBox contentContainer;
    @javafx.fxml.FXML
    private Label textileFactoryCOOlabel;

    private static final String FXML_BASE_PATH = "/com/example/textile_factory_management_system/amanna/COO/";


    private void loadFXMLView(String fxmlFilename) {
        try {
            // Construct the full absolute path
            String path = FXML_BASE_PATH + fxmlFilename;

            // 1. Create FXMLLoader
            FXMLLoader loader = new FXMLLoader(getClass().getResource(path));

            // 2. Load the Node/Parent from the component FXML
            Node view = loader.load();

            // 3. Clear the container and add the new view
            contentContainer.getChildren().clear();
            contentContainer.getChildren().add(view);

            // Note: If the component FXML has its own controller, you can access it here:
            // Object componentController = loader.getController();
            // If componentController implements an interface for data passing, you would call it here.

        } catch (IOException e) {
            e.printStackTrace();
            // Display error message in the content area itself
            contentContainer.getChildren().clear();
            contentContainer.getChildren().add(new Label("Error: Could not load component view " + fxmlFilename + ". Check the file path and FXML structure."));
        }
    }

    @javafx.fxml.FXML
    public void viewEmployeeDetailsOA(ActionEvent actionEvent) { loadFXMLView("ViewEmployeeDetails.fxml");
    }

    @javafx.fxml.FXML
    public void viewInventorySummaryButtonOA(ActionEvent actionEvent) { loadFXMLView("ViewInventorySummary.fxml");
    }

    @javafx.fxml.FXML
    public void setProductionTargetOA(ActionEvent actionEvent) { loadFXMLView("SetProductionTargetView.fxml");
    }

    @javafx.fxml.FXML
    public void approveLargeProductionOrderOA(ActionEvent actionEvent) { loadFXMLView("ApproveLargeProductionOrderView.fxml");
    }

    @javafx.fxml.FXML
    public void ViewProductionSummaryButtonOA(ActionEvent actionEvent) { loadFXMLView("ViewProductionSummary.fxml");
    }

    @javafx.fxml.FXML
    public void viewMonthlyPerformanceReportOA(ActionEvent actionEvent) { loadFXMLView("MonthlyPerformanceRecordView.fxml");
    }

    @javafx.fxml.FXML
    public void viewSalesSummaryButtonOA(ActionEvent actionEvent) { loadFXMLView("ViewSalesSummary.fxml");
    }

    @javafx.fxml.FXML
    public void viewProductionTargetSummaryOA(ActionEvent actionEvent) { loadFXMLView("ProductionTargetSummaryView.fxml");
    }
}
