module com.example.bmiclaculators24 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bmiclaculators24 to javafx.fxml;
    exports com.example.bmiclaculators24;
}