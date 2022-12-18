package DesignPattern.Chapter03.ch06_factorymethod;

public class CarTest {
    public static void main(String[] args) {

        CarFactory factory = new HyundaiCarFactory();
        Car newCar = factory.createCar("sonata");

        System.out.println(newCar);

        Car myCar = factory.returnCar("Tomas");
        Car hisCar = factory.returnCar("Tomas");

        System.out.println(myCar == hisCar);
    }
}
