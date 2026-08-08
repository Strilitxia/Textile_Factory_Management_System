package com.example.textile_factory_management_system.asif.ProductionManager.Controller;

import com.example.textile_factory_management_system.NonUser.Order;
import com.example.textile_factory_management_system.NonUser.Product;
import com.example.textile_factory_management_system.NonUser.ProductionTarget;
import com.example.textile_factory_management_system.asif.ProductionManager.Model.ProductionManager;
import com.example.textile_factory_management_system.utility.AlertHelper;
import com.example.textile_factory_management_system.utility.FileReadWrite;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class ProdManG1Controller {
    @javafx.fxml.FXML
    private ComboBox<Integer> TargetIdComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> productTypeComboBox;
    @javafx.fxml.FXML
    private TextField productQuantityTF;
    @javafx.fxml.FXML
    private ComboBox<Integer> orderIdComboBox;

    @FXML
    public void initialize(){
        ObservableList<Product> products = FileReadWrite.loadData(Product.class,"Products.bin");
        for (Product p: products){
            productTypeComboBox.getItems().add(p.getProductType());
        }
        ObservableList<ProductionTarget> productionTargets = FileReadWrite.loadData(ProductionTarget.class,"ProductionTargets.bin");
        for (ProductionTarget t: productionTargets){
            TargetIdComboBox.getItems().add(t.getTargetId());
        }
        ObservableList<Order> orders = FileReadWrite.loadData(Order.class,"Orders.bin");
        for (Order o: orders){
            orderIdComboBox.getItems().add(o.getOrderId());
        }
    }

    @javafx.fxml.FXML
    public void createBatchButtonOA(ActionEvent actionEvent) {
        if (TargetIdComboBox.getValue()==null || productTypeComboBox.getValue()==null || Integer.parseInt(productQuantityTF.getText())<1 || orderIdComboBox.getValue()==null){
            AlertHelper.showError("All fields must be entered");
        } else{
            if (ProductionManager.createNewProductionBatch(ProductionManager.generateBatchId(),Integer.parseInt(productQuantityTF.getText()),orderIdComboBox.getValue(),TargetIdComboBox.getValue(),productTypeComboBox.getValue(),"Incomplete", LocalDate.now())){
                AlertHelper.showInfo("Production Batch created Successfully");
            }else{
                AlertHelper.showError("An error occurred");
            }
        }
    }
}
