package org.example;

public abstract class playerSam extends Object { //абстрак расширяться путем наследования, можем создавать абстрактные методаыб без тела
    private String nickname;
    private int points;

    private final String russianProfession;


    public playerSam(String nickname, String points, String russianProfession) {
        this.nickname= nickname;
        this.points = Integer.parseInt(points);
        this.russianProfession = russianProfession;
    }
    public playerSam(String russianProfession){

        this.russianProfession = russianProfession;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = Integer.parseInt(points);
    }


    public String toString(){
        return String.format("%s %s имеет %s очков%nws",russianProfession , nickname ,points);
    }

    public void printinfo(){

        System.out.printf(String.valueOf(this));
    }

    public abstract void doaction(); // обьявлен для использования во всех экземплярах наследника


}
