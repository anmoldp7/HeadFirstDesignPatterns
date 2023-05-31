package factory.abstractFactory;

import java.util.stream.Stream;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official pizza store box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Name: " + name + "\n");
        if (dough != null) {
            sb.append("Dough: ");
            sb.append(dough);
            sb.append("\n");
        }

        if (sauce != null) {
            sb.append("Sauce: ");
            sb.append(sauce);
            sb.append("\n");
        }

        if (cheese != null) {
            sb.append("Cheese: ");
            sb.append(cheese);
            sb.append("\n");
        }

        if (veggies != null) {
            sb.append("Veggies: ");
            String[] veggiesArray = Stream.of(veggies).map(veggie -> veggie.toString()).toArray(String[]::new);
            sb.append(String.join(", ", veggiesArray));
        }

        if (clams != null) {
            sb.append("Clams: ");
            sb.append(clams);
            sb.append("\n");
        }

        if (pepperoni != null) {
            sb.append("Pepperoni: ");
            sb.append(pepperoni);
            sb.append("\n");
        }

        return sb.toString();
    }
}
