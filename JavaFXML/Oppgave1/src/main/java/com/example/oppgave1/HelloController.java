package com.example.oppgave1;

import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

class KodeGenerator{
        private int[] kodeArray;
        private Random r = new Random();
        private int nyKodeIndeks = 0;

        public KodeGenerator (int antall){
                kodeArray = new int[antall];
                genererKoder();
        }
        private void genererKoder(){
                for(int i=0;i<kodeArray.length;i++){
                        kodeArray[i]=100000+r.nextInt(900000);
                }
        }

        public String nyKode(int maksAntall){
                if(nyKodeIndeks<maksAntall){
                        return Integer.toString(kodeArray[nyKodeIndeks++]);
                } return "Maks antall!";
        }

        public String formaterBrukteKoder(){
                String ut = "";
                for(int j=0;j<kodeArray.length;j++){
                ut+=kodeArray[j]+"\n";
                } return ut;
        }
}

public class HelloController {
        public final int MAKS_ANTALL=10;
        private KodeGenerator generator = new KodeGenerator(MAKS_ANTALL);

        @FXML
        private Label lblGamleKoder;

        @FXML
        private Label lblNyKode;

        @FXML
        void gamleKoder(ActionEvent event) {
                lblGamleKoder.setText(generator.formaterBrukteKoder());
        }

        @FXML
        void nyKode(ActionEvent event) {
                lblNyKode.setText(generator.nyKode(MAKS_ANTALL));
        }

    }