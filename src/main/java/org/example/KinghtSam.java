package org.example;

public class KinghtSam extends playerSam {

    private String swordTitle;
    public KinghtSam(String nickname, int points,String swordTitle) {

        super(nickname, String.valueOf(points),"Рыцарь");
        this.swordTitle = swordTitle;
    }

    public KinghtSam (String nickname,int points){    //перегрузка конструктора
        this(nickname,points,"меч кладенец");
    }


    public void  saddleHorse(){
        System.out.println("Вперед, плотва");
    }

    public String getSwordTitle() {
        return swordTitle;
    }

    public void setSwordTitle(String swordTitle) {
        this.swordTitle = swordTitle;
    }
   /* public void printinfo(){
        super.printinfo();

        System.out.printf("Его меч %s%n", swordTitle);
    }*/

    public String toString(){
        return super.toString()+ " " + String.format(",a его меч: %s%n", swordTitle);
    }

    @Override                       //реализаяция метода
    public void doaction() {
        System.out.printf("%s машет мечом %s%n",getNickname(),getSwordTitle());
    }
}
