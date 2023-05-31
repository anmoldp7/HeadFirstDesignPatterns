package factory.abstractFactory;

import java.lang.IllegalArgumentException;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) throws IllegalArgumentException {
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                return new CheesePizza(pizzaIngredientFactory);
            case "veggie":
                return new VeggiePizza(pizzaIngredientFactory);
            case "clam":
                return new ClamPizza(pizzaIngredientFactory);
            case "pepperoni":
                return new PepperoniPizza(pizzaIngredientFactory);
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
