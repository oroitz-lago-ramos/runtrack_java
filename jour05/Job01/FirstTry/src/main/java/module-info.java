module com.example.firsttry {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.firsttry to javafx.fxml;
    exports com.example.firsttry;
}