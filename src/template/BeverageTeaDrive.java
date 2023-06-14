package template;

public class BeverageTeaDrive {
    public static void main(String[] args) {
        CaffeineBeverage coffeeWithHook = new CoffeeWithHook();

        System.out.println("Making coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
