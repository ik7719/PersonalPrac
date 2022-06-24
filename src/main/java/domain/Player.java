package domain;

public class Player {

    // 왜 final 선언이 안될까?
    private PlayerLevel level;

    Player(){
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public void upgradeLevel(PlayerLevel level){
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count){
        level.go(count);
    }

}
