package factory.factoryMethod;

import java.lang.IllegalArgumentException;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) throws IllegalArgumentException {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}

