module com.example.textile_factory_management_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.textile_factory_management_system to javafx.fxml;
    exports com.example.textile_factory_management_system;
    exports com.example.textile_factory_management_system.amanna.COO.Controller;
    opens com.example.textile_factory_management_system.amanna.COO.Controller to javafx.fxml;
    exports com.example.textile_factory_management_system.amanna.Worker.Controller;
    opens com.example.textile_factory_management_system.amanna.Worker.Controller to javafx.fxml;
}