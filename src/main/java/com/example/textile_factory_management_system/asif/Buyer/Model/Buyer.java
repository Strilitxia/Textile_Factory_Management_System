package com.example.textile_factory_management_system.asif.Buyer.Model;

import com.example.textile_factory_management_system.NonUser.BankReceipt;
import com.example.textile_factory_management_system.NonUser.Product;
import com.example.textile_factory_management_system.User;
import com.example.textile_factory_management_system.utility.FileReadWrite;
import javafx.collections.ObservableList;

public class Buyer extends User {

    private static final String PRODUCT_FILE = "Products.bin";
    private static final String BANK_RECEIPTS_FILE = "BankReceipts.bin";

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
}
