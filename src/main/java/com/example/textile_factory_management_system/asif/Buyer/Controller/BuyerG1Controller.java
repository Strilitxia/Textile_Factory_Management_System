package com.example.textile_factory_management_system.asif.Buyer.Controller;

import com.example.textile_factory_management_system.NonUser.Product;
import com.example.textile_factory_management_system.asif.Buyer.Model.Buyer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class BuyerG1Controller {
    @javafx.fxml.FXML
    private TableColumn<Product, Float> priceTC;
    @javafx.fxml.FXML
    private TableColumn<Product, Integer> productIdTC;
    @javafx.fxml.FXML
    private TableView<Product> productCatalogTV;
    @javafx.fxml.FXML
    private TableColumn<Product, String> descriptionTC;

    @FXML
    public void initialize() {
        descriptionTC.setCellValueFactory(new PropertyValueFactory<>("description"));
        priceTC.setCellValueFactory(new PropertyValueFactory<>("price"));
        productIdTC.setCellValueFactory(new PropertyValueFactory<>("productId"));
    }

    @javafx.fxml.FXML
    public void loadProductsButtonOA(ActionEvent actionEvent) {
        productCatalogTV.getItems().clear();
        productCatalogTV.getItems().addAll(Buyer.browseProductCatalog());
    }
}
