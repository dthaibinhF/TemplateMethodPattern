package subclass;

import TemplateMethod.CaffeineBeverage;

public class Tea extends CaffeineBeverage {
    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiment() {
        System.out.println("Adding Lemon");
    }
}
