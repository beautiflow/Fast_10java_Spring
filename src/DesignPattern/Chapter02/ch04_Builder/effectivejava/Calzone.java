package DesignPattern.Chapter02.ch04_Builder.effectivejava;

public class Calzone extends Pizza{

    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder{

        private boolean sauceInside = false;

        public Pizza.Builder sauceInside(){
            sauceInside = true;
            return this;
        }

        public Calzone build(){
            return new Calzone(this);
        }

        protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    public String toString(){
        return toppings.toString() + " sauceInside : " + sauceInside;
    }
}
