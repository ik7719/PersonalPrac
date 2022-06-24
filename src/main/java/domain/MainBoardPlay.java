package domain;

public class MainBoardPlay {

    public static void main(String[] args){

        Player player = new Player();
        player.play(1);

        AdvancedLevel levelA = new AdvancedLevel();
        player.upgradeLevel(levelA);
        player.play(2);

        SuperLevel levelS = new SuperLevel();
        player.upgradeLevel(levelS);
        player.play(3);
    }
}
