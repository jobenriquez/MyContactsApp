module com.example.mycontactsapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mycontactsapp to javafx.fxml;
    exports com.example.mycontactsapp;
}