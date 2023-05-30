package factory.factoryMethod;

public class PizzaTestDrive {
    public static void main(String[] args) throws Exception {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza nyCheesePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(nyCheesePizza.toString());

        Pizza chicagoPepperoniPizza = chicagoPizzaStore.orderPizza("pepperoni");
        System.out.println(chicagoPepperoniPizza.toString());
    }
}
