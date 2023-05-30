package factory.factoryMethod;

import java.lang.IllegalArgumentException;

public abstract class PizzaStore {
    public abstract Pizza createPizza(String type) throws IllegalArgumentException;

    public Pizza orderPizza(String type) throws IllegalArgumentException{
        Pizza pizza = createPizza(type);
        System.out.println("Making a pizza of type " + type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
