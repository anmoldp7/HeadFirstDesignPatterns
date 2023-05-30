package factory.simpleFactory;

public class PizzaTestDriver {
    public static void main(String[] args) throws Exception {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);

        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza.toString());

        pizza = pizzaStore.orderPizza("veggie");
        System.out.println(pizza.toString());
    }
}
