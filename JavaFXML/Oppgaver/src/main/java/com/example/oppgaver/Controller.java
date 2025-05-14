package com.example.oppgaver;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button Beregn;

    @FXML
    private Label lblResultat;

    @FXML
    private TextField txtBeløp;

    @FXML
    private TextField txtRente;

    @FXML
    private TextField txtÅr;

    @FXML
    void Beregn(ActionEvent event) {
        try {
            double beløp = Double.parseDouble(txtBeløp.getText());
            System.out.println(beløp);
            double rente = Double.parseDouble(txtRente.getText());
            double år = Double.parseDouble(txtÅr.getText());
            double resultat = beløp * Math.pow(1+(rente/100), år);
            lblResultat.setText("Totalbeløpet etter "+år+" år blir "+String.format("%.2f", resultat));
        }catch(Exception e){lblResultat.setText("Vennligst skriv inn et tall i alle feltene!");}

    }

}
