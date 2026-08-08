package com.example.textile_factory_management_system.asif.Buyer.Model;

import com.example.textile_factory_management_system.NonUser.*;
import com.example.textile_factory_management_system.User;
import com.example.textile_factory_management_system.utility.FileReadWrite;
import javafx.collections.ObservableList;

public class Buyer extends User {

    private static final String PRODUCT_FILE = "Products.bin";
    private static final String BANK_RECEIPTS_FILE = "BankReceipts.bin";
    private static final String RFQS_FILE = "RFQs.bin";
    private static final String QUOTATIONS_FILE = "Quotations.bin";
    private static final String ORDERS_FILE = "Orders.bin";

    public Buyer(int userId, String username, String password, String email, String role) {
        super(userId, username, password, email, role);
    }

    public static ObservableList<Product> browseProductCatalog() {
        return FileReadWrite.loadData(Product.class, PRODUCT_FILE);
    }

    public static boolean submitTransactionReceipt(int orderId, String bankName, String transactionId) {
        try {
            BankReceipt bankReceipt = new BankReceipt(orderId, bankName, transactionId);
            FileReadWrite.append(bankReceipt, BANK_RECEIPTS_FILE);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean submitRFQ(int productId, float bulkQuantity, int customerId){
        try{
            ObservableList<RFQ> existing_rfqs = FileReadWrite.loadData(RFQ.class, RFQS_FILE);
            int nextRfqId = existing_rfqs.size() + 1;
            RFQ rfq = new RFQ(nextRfqId, customerId, productId, bulkQuantity);
            FileReadWrite.append(rfq,RFQS_FILE);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static ObservableList<Quotation> loadAllQuotations() {
        return FileReadWrite.loadData(Quotation.class, QUOTATIONS_FILE);
    }

    public static boolean acceptOrRejectQuotation (int quotationId, String action) {
        ObservableList<Quotation> quotations = Buyer.loadAllQuotations();
        for (int i = 0; i < quotations.size(); i++) {
            Quotation currentQuotation = quotations.get(i);
            if (currentQuotation.getQuotationId() == quotationId) {
                currentQuotation.setStatus(action);
                quotations.set(i, currentQuotation);
                FileReadWrite.saveData(quotations, QUOTATIONS_FILE);
                return true;
            }
        }
        return false;
    }

    public static ObservableList<Order> viewRealtimeOrderStatus(){
        return FileReadWrite.loadData(Order.class,ORDERS_FILE);
    }
}
