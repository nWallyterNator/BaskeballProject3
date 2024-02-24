module com.example.baskeballproject3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.baskeballproject3 to javafx.fxml;
    exports com.example.baskeballproject3;

    opens model to javafx.base;
    exports model;
}