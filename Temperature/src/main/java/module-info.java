module com.example.temperature {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.temperature to javafx.fxml;
    exports com.example.temperature;
}