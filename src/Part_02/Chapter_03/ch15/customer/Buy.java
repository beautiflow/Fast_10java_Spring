package Part_02.Chapter_03.ch15.customer;

public interface Buy {

     void buy();


    default void order(){
        System.out.println("buy order");
    }
}
