module com.sanduni.testproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.sanduni.testproject.controller to javafx.fxml;
    exports com.sanduni.testproject;
}