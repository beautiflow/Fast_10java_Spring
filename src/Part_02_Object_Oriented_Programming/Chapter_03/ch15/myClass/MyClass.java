package Part_02_Object_Oriented_Programming.Chapter_03.ch15.myClass;

public class MyClass implements MyInterface{

    @Override
    public void x() {
        System.out.println("x()");
    }

    @Override
    public void y() {
        System.out.println("y()");
    }

    @Override
    public void myMethod() {
        System.out.println("myMethod");
    }
}
