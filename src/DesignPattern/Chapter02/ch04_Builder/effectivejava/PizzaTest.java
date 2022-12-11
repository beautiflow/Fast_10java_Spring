package DesignPattern.Chapter02.ch04_Builder.effectivejava;

public class PizzaTest {
    public static void main(String[] args) {

        Pizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL).addToping(Pizza.Topping.SAUSAGE)
                .addToping(Pizza.Topping.ONION).build();

        Pizza calzone = new Calzone.Builder().addToping(Pizza.Topping.HAM).addToping(Pizza.Topping.PEPPER)
                .sauceInside().build();

        System.out.println(nyPizza);
        System.out.println(calzone);
    }
}
