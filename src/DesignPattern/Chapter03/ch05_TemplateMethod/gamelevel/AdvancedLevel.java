package DesignPattern.Chapter03.ch05_TemplateMethod.gamelevel;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("잘 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("Jump 할 수 있습니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모릅니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("*** 중급자 레벨 입니다. ***");
    }
}
