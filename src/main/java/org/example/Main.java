package org.example;

public class Main {
    public static void main(String[] args) {
        //KinghtSam player = new KinghtSam();
        WizardSam wizard = new WizardSam("Александр",424);
        KinghtSam knight = new KinghtSam("Анатолий",444,"Экскалибурw");

        //player.printinfo();
        wizard.printinfo();
        knight.printinfo();
        wizard.doaction();
        knight.doaction();

    }
}