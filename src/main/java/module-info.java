module com.example.textile_factory_management_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.textile_factory_management_system to javafx.fxml;
    exports com.example.textile_factory_management_system;
    exports com.example.textile_factory_management_system.amanna.COO.Controller;
    opens com.example.textile_factory_management_system.amanna.COO.Controller to javafx.fxml;
    exports com.example.textile_factory_management_system.amanna.Worker.Controller;
    opens com.example.textile_factory_management_system.amanna.Worker.Controller to javafx.fxml;
    opens com.example.textile_factory_management_system.asif.Buyer.Controller to javafx.fxml;
    exports com.example.textile_factory_management_system.asif.Buyer.Controller;
    opens com.example.textile_factory_management_system.asif.ProductionManager.Controller to javafx.fxml;
    exports com.example.textile_factory_management_system.asif.ProductionManager.Controller;
    opens com.example.textile_factory_management_system.dilir.HrManager.Controller to javafx.fxml;
    exports com.example.textile_factory_management_system.dilir.HrManager.Controller;
    opens com.example.textile_factory_management_system.dilir.SalesManager.Controller to javafx.fxml;
    exports com.example.textile_factory_management_system.dilir.SalesManager.Controller;
}