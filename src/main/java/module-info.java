module com.example.textile_factory_management_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.textile_factory_management_system to javafx.fxml;
    exports com.example.textile_factory_management_system;
}