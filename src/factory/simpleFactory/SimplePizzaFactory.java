package factory.simpleFactory;

import java.lang.IllegalArgumentException;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) throws IllegalArgumentException {
        switch(type) {
            case "cheese":
                return new CheesePizza();
            case "pepperoni":
                return new PepperoniPizza();
            case "clam":
                return new ClamPizza();
            case "veggie":
                return new VeggiePizza();
            default:
                throw new IllegalArgumentException("Invalid pizza type used: " + type);
        }
    }
}
