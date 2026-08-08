package com.example.textile_factory_management_system.asif.Buyer.Controller;

import com.example.textile_factory_management_system.NonUser.Order;
import com.example.textile_factory_management_system.asif.Buyer.Model.Buyer;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class BuyerG4Controller {
    @javafx.fxml.FXML
    private TableColumn<Order, LocalDate> scheduleDateTC;
    @javafx.fxml.FXML
    private TableColumn<Order,String> productTypeTC;
    @javafx.fxml.FXML
    private TableColumn<Order,String> statusTC;
    @javafx.fxml.FXML
    private TableColumn<Order,Integer> orderIdTC;
    @javafx.fxml.FXML
    private TableColumn<Order, Integer> quantityTC;
    @javafx.fxml.FXML
    private TableView<Order> orderTV;

    @FXML
    public void initialize(){
        orderIdTC.setCellValueFactory(new PropertyValueFactory<>("scheduleDate"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        productTypeTC.setCellValueFactory(new PropertyValueFactory<>("productType"));
        quantityTC.setCellValueFactory(new PropertyValueFactory<>("quantity"));
    }

    @javafx.fxml.FXML
    public void loadOrderButtonOA(ActionEvent actionEvent) {
        ObservableList<Order> orders = Buyer.viewRealtimeOrderStatus();
        orderTV.getItems().clear();
        for (Order i : orders){
            if(!i.getStatus().equals("Completed")){
                orderTV.getItems().add(i);
            }
        }
    }
}
