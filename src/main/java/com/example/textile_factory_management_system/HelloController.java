package com.example.textile_factory_management_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField usernameTF;
    @FXML
    private TextField passwordTF;
    @FXML
    private Label failureLabel;
    @FXML
    private AnchorPane contentContainer;

    private static final String FXML_BASE_PATH = "/com/example/textile_factory_management_system/";

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

    @FXML
    public void loginButtonOA(ActionEvent actionEvent) {
        if (passwordTF.getText().equals("123")) {
            if (usernameTF.getText().equals("coo")){
                loadFXMLView("amanna/COO/COOView.fxml");
            } else if (usernameTF.getText().equals("worker")){
                loadFXMLView("amanna/worker/WorkerView.fxml");
            } else if (usernameTF.getText().equals("buyer")){
                loadFXMLView("asif/buyer/BuyerView.fxml");
            } else if (usernameTF.getText().equals("productionmanager")){
                loadFXMLView("asif/ProductionManager/productionManagerView.fxml");
            } else if (usernameTF.getText().equals("hrmanager")){
                loadFXMLView("dilir/HrManager/HrManagerView.fxml");
            } else if (usernameTF.getText().equals("salesmanager")){
                loadFXMLView("dilir/SalesManager/SalesManagerView.fxml");
            } else if (usernameTF.getText().equals("inventorymanager")){
                loadFXMLView("tashfia/InventoryManager/InventoryManagerView.fxml");
            } else if (usernameTF.getText().equals("supplier")){
                loadFXMLView("tashfia/Supplier/SupplierView.fxml");
            } else {
                failureLabel.setText(null);
                failureLabel.setText("Incorrect user name.");
            }
        } else {
            failureLabel.setText(null);
            failureLabel.setText("Entered wrong password.");
        }
    }
}
