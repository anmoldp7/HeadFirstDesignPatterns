package factory.simpleFactory;

import java.util.ArrayList;
import java.util.List;

abstract public class Pizza {
    String name;
    String sauce;
    String dough;
    List<String> toppings = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
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
