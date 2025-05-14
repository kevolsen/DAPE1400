module com.example.oppgave1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oppgave1 to javafx.fxml;
    exports com.example.oppgave1;
}