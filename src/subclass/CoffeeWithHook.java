package subclass;

import TemplateMethod.CaffeineBeverage;

import java.io.IOException;
import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dtipping coffee through filter");
    }
    public void addCondiment() {
        System.out.println("Adding sugar and milk");
    }
    @Override
    public boolean customerWantsCondiment() { // this is the hook
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }
    private String getUserInput() {
        String answer = new String();
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        Scanner sc = new Scanner(System.in);
        try {
            answer = sc.nextLine();
        } catch (Exception e) {
            System.out.println("IO ");
        }

        if (answer == null) return "no";

        return answer;
    }
}
