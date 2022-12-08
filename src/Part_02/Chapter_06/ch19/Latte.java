package Part_02.Chapter_06.ch19;

public class Latte extends Decorator{

    public Latte(Coffee coffee) {
        super(coffee);
    }

    public void brewing(){
        super.brewing();
        System.out.println("Adding Milk");
    }
}
