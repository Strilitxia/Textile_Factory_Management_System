package com.example.textile_factory_management_system.asif.Buyer.Controller;

import com.example.textile_factory_management_system.NonUser.Quotation;
import com.example.textile_factory_management_system.asif.Buyer.Model.Buyer;
import com.example.textile_factory_management_system.utility.AlertHelper;
import com.example.textile_factory_management_system.utility.FileReadWrite;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class BuyerG3Controller {
    @javafx.fxml.FXML
    private TableColumn<Quotation, String> productTypeTC;
    @javafx.fxml.FXML
    private TableColumn<Quotation, Float> proposedUnitPriceTC;
    @javafx.fxml.FXML
    private TableColumn<Quotation, Integer> rfqIdTC;
    @javafx.fxml.FXML
    private TableView<Quotation> quotationTV;
    @javafx.fxml.FXML
    private ComboBox<String> selectActionCB;
    @javafx.fxml.FXML
    private ComboBox<Integer> selectQuotationCB;

    @FXML
    public void initialize() {
        productTypeTC.setCellValueFactory(new PropertyValueFactory<>("productType"));
        rfqIdTC.setCellValueFactory(new PropertyValueFactory<>("rfqId"));
        proposedUnitPriceTC.setCellValueFactory(new PropertyValueFactory<>("proposedUnitPrice"));

        selectActionCB.getItems().addAll("Accept", "Reject");
    }

    @javafx.fxml.FXML
    public void loadQuotationButtonOA(ActionEvent actionEvent) {
        quotationTV.setItems(null);
        ObservableList<Quotation> quotations = Buyer.loadAllQuotations();
        quotationTV.setItems(quotations);
        selectQuotationCB.getItems().clear();
        for (Quotation q:quotations) {
            selectQuotationCB.getItems().add(q.getQuotationId());
        }
    }

    @javafx.fxml.FXML
    public void actionButtonOA(ActionEvent actionEvent) {
        if (selectQuotationCB.getValue() == null) {
            AlertHelper.showError("Select a quotation.");
            return;
        }
        if (selectActionCB.getValue() == null) {
            AlertHelper.showError("Select an action.");
            return;
        }
        if (Buyer.acceptOrRejectQuotation(selectQuotationCB.getValue(), selectActionCB.getValue())) {
            AlertHelper.showInfo("Status updated successfully!");
        } else {
            AlertHelper.showError("Error!");
        }
    }
}
