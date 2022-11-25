package Part_02_Object_Oriented_Programming.Chapter_03.ch15.customer;

public interface Sell {

    void sell();

    default void order(){
        System.out.println("sell order");
    }
}
