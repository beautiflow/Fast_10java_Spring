package Part_02_Object_Oriented_Programming.Chapter_03.ch15.customer;

public class Customer implements Buy, Sell {

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void order() {
        System.out.println("customer order");
    }

    public void hello(){
        System.out.println("hello");
    }
}
