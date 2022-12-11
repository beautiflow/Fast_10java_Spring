package DesignPattern.Chapter03.ch05_TemplateMethod.gamelevel;

public class Player {

    private PlayerLevel level;

    public Player(){
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public void upgradeLevel(PlayerLevel level){
        level.showLevelMessage();
        this.level = level;
    }

    public PlayerLevel getPlayerleverl(){
        return level;
    }

    public void play(int count){
        level.go(count);
    }
}
