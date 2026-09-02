package com.github.zia;

public class PizzaBuilder {
    private final String size;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean mushrooms;

    private PizzaBuilder(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
    }

    public void show() {
        System.out.println("Pizza [" + size + ", Cheese=" + cheese + ", Pepperoni=" + pepperoni + ", Mushrooms=" + mushrooms + "]");
    }

    public static class Builder {
        private final String size;
        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean mushrooms = false;

        public Builder(String size) {
            this.size = size;
        }

        public Builder addCheese() {
            this.cheese = true;
            return this;
        }

        public Builder addPepperoni() {
            this.pepperoni = true;
            return this;
        }

        public Builder addMushrooms() {
            this.mushrooms = true;
            return this;
        }

        public PizzaBuilder build() {
            return new PizzaBuilder(this);
        }
    }
}

class Pizzas {
    public static void main(String[] args) {
        PizzaBuilder pizza1 = new PizzaBuilder.Builder("Large")
                .addCheese()
                .addPepperoni()
                .build();

        PizzaBuilder pizza2 = new PizzaBuilder.Builder("Small")
                .addCheese()
                .addMushrooms()
                .build();

        pizza1.show();
        pizza2.show();
    }
}
