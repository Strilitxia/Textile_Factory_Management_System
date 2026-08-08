package com.example.textile_factory_management_system;

import com.example.textile_factory_management_system.NonUser.Attendance;
import com.example.textile_factory_management_system.NonUser.BankReceipt;
import com.example.textile_factory_management_system.NonUser.Employee;
import com.example.textile_factory_management_system.NonUser.Invoice;
import com.example.textile_factory_management_system.NonUser.Complaint;
import com.example.textile_factory_management_system.NonUser.LeaveRequest;
import com.example.textile_factory_management_system.NonUser.MaterialRequisition;
import com.example.textile_factory_management_system.NonUser.Payroll;
import com.example.textile_factory_management_system.NonUser.Order;
import com.example.textile_factory_management_system.NonUser.Product;
import com.example.textile_factory_management_system.NonUser.ProductReview;
import com.example.textile_factory_management_system.NonUser.ProductionBatch;
import com.example.textile_factory_management_system.NonUser.ProductionOutput;
import com.example.textile_factory_management_system.NonUser.ProductionTarget;
import com.example.textile_factory_management_system.NonUser.ProductionTask;
import com.example.textile_factory_management_system.NonUser.Quotation;
import com.example.textile_factory_management_system.NonUser.RFQ;
import com.example.textile_factory_management_system.NonUser.ShiftChangeRequest;
import com.example.textile_factory_management_system.amanna.COO.Model.RawMaterial;
import com.example.textile_factory_management_system.amanna.Worker.Model.Worker;
import com.example.textile_factory_management_system.utility.FileReadWrite;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        seedData();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Textile Factory Management System");
        stage.setScene(scene);
        stage.show();
    }

    public static void seedData() {
        File workersFile = new File("Workers.bin");
        if (workersFile.exists()) {
            return;
        }

        // Employees.bin
        Employee worker1 = new Employee(1, "rahim", "pass", "rahim@tfms.com", "Worker", 123456, 5000, "Rahim", "Production", "Reliable", 4.2f);
        Employee worker2 = new Employee(2, "karim", "pass", "karim@tfms.com", "Worker", 234567, 5500, "Karim", "Production", "Punctual", 4.5f);
        Employee worker3 = new Employee(3, "jamil", "pass", "jamil@tfms.com", "Worker", 345678, 6000, "Jamil", "Production", "Team Lead", 4.7f);
        FileReadWrite.append(worker1, "Employees.bin");
        FileReadWrite.append(worker2, "Employees.bin");
        FileReadWrite.append(worker3, "Employees.bin");

        // Workers.bin
        Worker w1 = new Worker(1, "rahim", "pass", "rahim@tfms.com", "worker", "Morning", "5 hours");
        Worker w2 = new Worker(2, "karim", "pass", "karim@tfms.com", "worker", "Evening", "4 hours");
        Worker w3 = new Worker(3, "jamil", "pass", "jamil@tfms.com", "worker", "Morning", "5 hours");
        FileReadWrite.append(w1, "Workers.bin");
        FileReadWrite.append(w2, "Workers.bin");
        FileReadWrite.append(w3, "Workers.bin");

        // LeaveRequests.bin
        LeaveRequest lr1 = new LeaveRequest(1, 1, LocalDate.now().plusDays(3), "Family function", false);
        FileReadWrite.append(lr1, "LeaveRequests.bin");

        // ShiftChangeRequests.bin
        ShiftChangeRequest scr1 = new ShiftChangeRequest(1, 1, "Morning", "Evening", false);
        FileReadWrite.append(scr1, "ShiftChangeRequests.bin");

        // Attendance.bin
        Attendance a1 = new Attendance(LocalDate.now(), 1, "Present", "09:00", "17:00");
        Attendance a2 = new Attendance(LocalDate.now(), 2, "Present", "07:00", "19:00");
        FileReadWrite.append(a1, "Attendance.bin");
        FileReadWrite.append(a2, "Attendance.bin");

        // Products.bin
        Product p1 = new Product(1, "Cotton T-Shirt", "T-Shirt", 350.0f);
        Product p2 = new Product(2, "Denim Jeans", "Jeans", 1200.0f);
        Product p3 = new Product(3, "Silk Scarf", "Scarf", 800.0f);
        FileReadWrite.append(p1, "Products.bin");
        FileReadWrite.append(p2, "Products.bin");
        FileReadWrite.append(p3, "Products.bin");

        // RFQs.bin
        RFQ rfq1 = new RFQ(1, 1, 1, 200.0f);
        RFQ rfq2 = new RFQ(2, 2, 2, 100.0f);
        FileReadWrite.append(rfq1, "RFQs.bin");
        FileReadWrite.append(rfq2, "RFQs.bin");

        // Quotations.bin
        Quotation q1 = new Quotation(1, 1, 320.0f, "T-Shirt");
        Quotation q2 = new Quotation(2, 2, 1150.0f, "Jeans");
        FileReadWrite.append(q1, "Quotations.bin");
        FileReadWrite.append(q2, "Quotations.bin");

        // Orders.bin (and LargeOrders.bin via the >= 500 side effect in Order constructor)
        Order order1 = new Order(1, 100, "T-Shirt", "Pending", LocalDate.now().plusDays(7));
        Order order2 = new Order(2, 600, "Jeans", "Pending", LocalDate.now().plusDays(14));
        Order order3 = new Order(1, 50, "Scarf", "Completed", LocalDate.now().minusDays(10));
        FileReadWrite.append(order1, "Orders.bin");
        FileReadWrite.append(order2, "Orders.bin");
        FileReadWrite.append(order3, "Orders.bin");

        // Invoices.bin
        Invoice inv1 = new Invoice(1, 1, 32000.0f);
        Invoice inv2 = new Invoice(2, 2, 690000.0f);
        FileReadWrite.append(inv1, "Invoices.bin");
        FileReadWrite.append(inv2, "Invoices.bin");

        // Reviews.bin
        ProductReview rev1 = new ProductReview(1, "T-Shirt", 1, 5, "Excellent fabric");
        ProductReview rev2 = new ProductReview(2, "Jeans", 2, 4, "Good fit");
        FileReadWrite.append(rev1, "Reviews.bin");
        FileReadWrite.append(rev2, "Reviews.bin");

        // BankReceipts.bin
        BankReceipt br1 = new BankReceipt(1, "DBBL", "TXN1001");
        BankReceipt br2 = new BankReceipt(2, "BRAC", "TXN1002");
        FileReadWrite.append(br1, "BankReceipts.bin");
        FileReadWrite.append(br2, "BankReceipts.bin");

        // ProductionTargets.bin
        ProductionTarget pt1 = new ProductionTarget(500, "T-Shirt", LocalDate.now().plusDays(30));
        ProductionTarget pt2 = new ProductionTarget(1000, "Jeans", LocalDate.now().plusDays(45));
        FileReadWrite.append(pt1, "ProductionTargets.bin");
        FileReadWrite.append(pt2, "ProductionTargets.bin");

        // ProductionBatches.bin
        ProductionBatch pb1 = new ProductionBatch(1, 100, 1, 1, "T-Shirt", "Incomplete", LocalDate.now());
        ProductionBatch pb2 = new ProductionBatch(2, 200, 2, 2, "Jeans", "Incomplete", LocalDate.now());
        FileReadWrite.append(pb1, "ProductionBatches.bin");
        FileReadWrite.append(pb2, "ProductionBatches.bin");

        // ProductionOutputs.bin
        ProductionOutput po1 = new ProductionOutput(1, 1, 100, 5, 95);
        ProductionOutput po2 = new ProductionOutput(2, 2, 200, 10, 190);
        FileReadWrite.append(po1, "ProductionOutputs.bin");
        FileReadWrite.append(po2, "ProductionOutputs.bin");

        // ProductionTasks.bin
        ProductionTask ptask1 = new ProductionTask(1, 1, "Cut fabric for batch 1");
        ProductionTask ptask2 = new ProductionTask(2, 2, "Stitch batch 2");
        FileReadWrite.append(ptask1, "ProductionTasks.bin");
        FileReadWrite.append(ptask2, "ProductionTasks.bin");

        // MaterialRequisitions.bin
        MaterialRequisition mr1 = new MaterialRequisition("Cloth", 200.0f);
        MaterialRequisition mr2 = new MaterialRequisition("Thread", 50.0f);
        FileReadWrite.append(mr1, "MaterialRequisitions.bin");
        FileReadWrite.append(mr2, "MaterialRequisitions.bin");

        // Payroll.bin
        Payroll pr1 = new Payroll(1, "January", 5000.0f, 10.0f, 500.0f, 200.0f, 5300.0f, "Paid");
        Payroll pr2 = new Payroll(2, "January", 5500.0f, 8.0f, 400.0f, 150.0f, 5750.0f, "Paid");
        Payroll pr3 = new Payroll(3, "January", 6000.0f, 12.0f, 600.0f, 250.0f, 6350.0f, "Paid");
        FileReadWrite.append(pr1, "Payroll.bin");
        FileReadWrite.append(pr2, "Payroll.bin");
        FileReadWrite.append(pr3, "Payroll.bin");

        // Complaints.bin
        Complaint c1 = new Complaint(1, 1, "Machine not working properly", "", "Unresolved");
        FileReadWrite.append(c1, "Complaints.bin");

        // RawMaterials.bin
        RawMaterial rm1 = new RawMaterial(1, "Cotton", 500, 250, LocalDate.now().plusMonths(6));
        RawMaterial rm2 = new RawMaterial(2, "Denim", 300, 800, LocalDate.now().plusMonths(8));
        RawMaterial rm3 = new RawMaterial(3, "Silk", 100, 1500, LocalDate.now().plusMonths(12));
        FileReadWrite.append(rm1, "RawMaterials.bin");
        FileReadWrite.append(rm2, "RawMaterials.bin");
        FileReadWrite.append(rm3, "RawMaterials.bin");
    }
}
