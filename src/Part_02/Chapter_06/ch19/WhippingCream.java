package Part_02.Chapter_06.ch19;

public class WhippingCream extends Decorator{
    public WhippingCream(Coffee coffee) {
        super(coffee);
    }

    public void brewing(){
        super.brewing();
        System.out.println("Adding Wipping Cream");
    }
}
