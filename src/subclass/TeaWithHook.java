package subclass;

import TemplateMethod.CaffeineBeverage;

import java.util.Scanner;

public class TeaWithHook extends CaffeineBeverage {
    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiment() {
        System.out.println("Adding Lemon");
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
