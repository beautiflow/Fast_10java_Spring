package Part_02.Chapter_03.ch10;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    public void washCar(){}  // 구현된 메서드이지만 구현내용이 없는 것이다. 추상메서드가 아니다.

    final public void run(){
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
        washCar();
    }
}
