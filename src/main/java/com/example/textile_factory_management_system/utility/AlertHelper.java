package com.example.textile_factory_management_system.utility;

import javafx.scene.control.Alert;

public class AlertHelper {
    public static void showError(String contentText) {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText(contentText);
        a.showAndWait();
    }

    public static void showInfo (String contentText) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(contentText);
        a.showAndWait();
    }
}
