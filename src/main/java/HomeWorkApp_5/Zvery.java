package HomeWorkApp_5;

public class Zvery {

    String nickname;

    private int maxRun;
    private int maxSwimming;

    public Zvery (String nickname, int maxRun,int maxSwimming){
        this.nickname = nickname;
        this.maxRun = maxRun;
        this.maxSwimming = maxSwimming;

    }

    public void run(int obstacle){ // метод бег
       if (obstacle <= maxRun) {
           System.out.println(nickname + ", пробежал: метров " + obstacle);
       }else
           System.out.println(nickname + ", не смог пробежать" + obstacle);
    }

    public void swim(int obstacle){ // метод плавание
        if (obstacle <= maxSwimming) {
            System.out.println(nickname + ", проплыл: метров " + obstacle);
        }else
            System.out.println(nickname + ", не смог проплыть" + obstacle);
    }


}





