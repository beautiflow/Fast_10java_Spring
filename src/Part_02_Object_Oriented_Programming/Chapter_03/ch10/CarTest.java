package Part_02_Object_Oriented_Programming.Chapter_03.ch10;

public class CarTest {
    public static void main(String[] args) {

        Car aiCar = new AICar();
        aiCar.run();

        System.out.println("=========================");

        Car mCar = new ManualCar();
        mCar.run();
    }
}
