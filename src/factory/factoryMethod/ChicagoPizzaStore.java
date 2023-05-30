package factory.factoryMethod;

import java.lang.IllegalArgumentException;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) throws IllegalArgumentException {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
