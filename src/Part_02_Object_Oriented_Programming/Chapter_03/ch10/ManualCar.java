package Part_02_Object_Oriented_Programming.Chapter_03.ch10;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 핸들은 조작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("장애물 앞에서 브레이크를 밟아서 정지합니다.");
    }

    @Override
    public void wiper() {

    }
}