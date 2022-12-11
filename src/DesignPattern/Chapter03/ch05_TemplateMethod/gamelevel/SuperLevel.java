package DesignPattern.Chapter03.ch05_TemplateMethod.gamelevel;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("아주 잘 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 잘 Jump 합니다.");

    }

    @Override
    public void turn() {
        System.out.println("Turn을 잘 합니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("*** 고급자 레벨 입니다.***");

    }

    @Override
    public void fly() {
        System.out.println("엄청 높이 날아갑니다.");
    }
}
