package DesignPattern.Chapter03.ch05_TemplateMethod.gamelevel;

public abstract class PlayerLevel {

    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    public void fly(){}

    final public void go(int count){

        run();

        for(int i = 0; i < count; i++){
            jump();
        }

        turn();

        fly();
    }
}
