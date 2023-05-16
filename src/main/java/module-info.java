module com.example.spring {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.context;


    opens com.example.spring to javafx.fxml;
    exports com.example.spring;
}