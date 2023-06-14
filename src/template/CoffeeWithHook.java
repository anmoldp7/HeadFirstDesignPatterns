package template;

import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding sugar and milk.");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk & sugar with your coffee (y/n)?");
        
        try (Scanner sc = new Scanner(System.in)) {
            answer = sc.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return answer;
    }
}
