package oppgaver;

import javax.swing.*;

class Klokke {
    private int time;
    private int minutter;
    private int sekunder;

    public Klokke(int time, int minutter, int sekunder) {
        setTime(time);
        setMinutter(minutter);
        setSekunder(sekunder);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if(time >= 0 && time <= 24) {
            this.time = time;
        }
    }

    public int getMinutter() {
        return minutter;
    }

    public void setMinutter(int minutter) {
        if(minutter >= 0 && minutter <= 59) {
            this.minutter = minutter;
        }
    }

    public int getSekunder() {
        return sekunder;
    }

    public void setSekunder(int sekunder) {
        if(sekunder >= 0 && sekunder <= 59) {
            this.sekunder = sekunder;
        }
    }

    public void showTime() {
        System.out.println("Kl. er "+time+":"+minutter+":"+sekunder);
    }
}



public class Oppgave4 {
    public static void main(String[] args) {
        Klokke tid1 = new Klokke(12,45,01);
        tid1.showTime();
        Klokke tid2 = new Klokke(17,05,11);
        tid2.showTime();
    }

}
