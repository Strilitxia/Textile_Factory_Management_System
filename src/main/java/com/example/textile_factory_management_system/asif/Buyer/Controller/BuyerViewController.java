package com.example.textile_factory_management_system.asif.Buyer.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class BuyerViewController {
    @javafx.fxml.FXML
    private Label welcomeLabel;
    @javafx.fxml.FXML
    private VBox contentContainer;

    private static final String FXML_BASE_PATH = "/com/example/textile_factory_management_system/asif/Buyer/";


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
    public void submitBankTransactionButtonOA(ActionEvent actionEvent) {
        loadFXMLView("G7submitBankTransactionID.fxml");
    }

    @javafx.fxml.FXML
    public void requestForQuotationButtonOA(ActionEvent actionEvent) {
        loadFXMLView("G2resquestForQuotation.fxml");
    }

    @javafx.fxml.FXML
    public void browseProductCatalogButtonOA(ActionEvent actionEvent) {
        loadFXMLView("G1browseProductCatalog.fxml");
    }

    @javafx.fxml.FXML
    public void submitReviewButtonOA(ActionEvent actionEvent) {
        loadFXMLView("G8submitProductReview.fxml");
    }

    @javafx.fxml.FXML
    public void acceptOrRejectButtonOA(ActionEvent actionEvent) {
        loadFXMLView("G3viewSentQuotations.fxml");
    }

    @javafx.fxml.FXML
    public void downloadInvoiceButtonOA(ActionEvent actionEvent) {
        loadFXMLView("G6downloadInvoice.fxml");
    }

    @javafx.fxml.FXML
    public void viewOrderHistoryButtonOA(ActionEvent actionEvent) {
        loadFXMLView("G5viewPastOrderHistory.fxml");
    }

    @javafx.fxml.FXML
    public void trackOrderStatusOA(ActionEvent actionEvent) {
        loadFXMLView("G4trackOrderStatus.fxml");
    }
}
