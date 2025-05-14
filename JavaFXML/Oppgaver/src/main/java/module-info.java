module com.example.oppgaver {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oppgaver to javafx.fxml;
    exports com.example.oppgaver;
}