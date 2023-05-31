package factory.abstractFactory;

public class PizzaTestDrive {
    public static void main(String[] args) throws Exception {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyPepperoniPizza = nyPizzaStore.orderPizza("pepperoni");
        nyPepperoniPizza.setName("NY Pepperoni Pizza");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoCheesePizza = chicagoPizzaStore.orderPizza("cheese");
        chicagoCheesePizza.setName("Chicago Cheese Pizza");

        System.out.println(nyPepperoniPizza.toString());
        System.out.println(chicagoCheesePizza.toString());
    }
}
