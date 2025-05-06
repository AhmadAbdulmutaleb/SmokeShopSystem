module org.example.smokeshopsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.smokeshopsystem to javafx.fxml;
    exports org.example.smokeshopsystem;
}