package com.example.textile_factory_management_system.dilir.SalesManager.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class SalesManagerController {
    @javafx.fxml.FXML
    private Label welcomeLabel;
    @javafx.fxml.FXML
    private VBox contentContainer;

    private static final String FXML_BASE_PATH = "/com/example/textile_factory_management_system/dilir/SalesManager/";

    @javafx.fxml.FXML
    public void initialize() {
        welcomeLabel.setText("Welcome, Sales Manager!");
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
            contentContainer.getChildren().clear();
            contentContainer.getChildren().add(new Label("Error: Could not load component view " + fxmlFilename + ". Check the file path and FXML structure."));
        }
    }

    @javafx.fxml.FXML
    public void createCustomerProfilesButton(ActionEvent actionEvent) {
        loadFXMLView("CreateCustomerProfiles.fxml");
    }

    @javafx.fxml.FXML
    public void buyerRFQsButton(ActionEvent actionEvent) {
        loadFXMLView("BuyerRFQs.fxml");
    }

    @javafx.fxml.FXML
    public void sendQuotationButton(ActionEvent actionEvent) {
        loadFXMLView("SendQuotation.fxml");
    }

    @javafx.fxml.FXML
    public void approvePaymentAndUpdateButton(ActionEvent actionEvent) {
        loadFXMLView("ApprovePayment&Update.fxml");
    }

    @javafx.fxml.FXML
    public void createBuyerCatalogButton(ActionEvent actionEvent) {
        loadFXMLView("CreateBuyerCatalog.fxml");
    }

    @javafx.fxml.FXML
    public void updateProductPricesButton(ActionEvent actionEvent) {
        loadFXMLView("UpdateProductPrices.fxml");
    }

    @javafx.fxml.FXML
    public void createOrderButton(ActionEvent actionEvent) {
        loadFXMLView("CreateOrder.fxml");
    }

    @javafx.fxml.FXML
    public void createInvoiceAndDeliverySlipButton(ActionEvent actionEvent) {
        loadFXMLView("CreateInvoice&DeliverySlip.fxml");
    }
}