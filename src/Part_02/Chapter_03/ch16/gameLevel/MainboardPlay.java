package Part_02.Chapter_03.ch16.gameLevel;

public class MainboardPlay {

    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        AdvancedLevel advancedLevel = new AdvancedLevel();
        player.upgradeLevel(advancedLevel);
        player.play(2);

        SuperLevel superLevel = new SuperLevel();
        player.upgradeLevel(superLevel);
        player.play(3);



    }
}
