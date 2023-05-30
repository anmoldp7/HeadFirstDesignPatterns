package factory.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String sauce;
    String dough;
    List<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        System.out.println(String.join(", ", toppings.toArray(new String[toppings.size()])));
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("Name: " + name + "\n");
        display.append("Dough: " + dough + "\n");
        display.append("Sauce: " + sauce + "\n");
        display.append("Toppings: ");
        display.append(String.join(", ", toppings.toArray(new String[toppings.size()])));
        return display.toString();
    }
}
