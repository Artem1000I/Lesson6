package org.example;

public class WizardSam extends playerSam { // укстенд наследование класса плеер


    public WizardSam(String nickname, int points) {

        super(nickname, String.valueOf(points), "Волшебник");
    }

    @Override
    public void doaction() {
        System.out.printf("%s астует заклинание",getNickname());
    }
}