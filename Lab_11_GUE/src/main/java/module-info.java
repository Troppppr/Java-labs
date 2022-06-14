module com.example.lab_11_gue {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab_11_gue to javafx.fxml;
    exports com.example.lab_11_gue;
}