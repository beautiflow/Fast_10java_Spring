package Part_02_Object_Oriented_Programming.Chapter_03.ch09;

public class Desktop extends Computer {

    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }

    @Override
    void turnOff() {
        System.out.println("Desktop turnOff");
    }
}