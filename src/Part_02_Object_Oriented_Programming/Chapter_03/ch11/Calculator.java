package Part_02_Object_Oriented_Programming.Chapter_03.ch11;

public abstract class Calculator implements Calc{
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }


}