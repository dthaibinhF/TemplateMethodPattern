package subclass;
import TemplateMethod.CaffeineBeverage;
public class Coffee extends CaffeineBeverage{
    public void brew() {
        System.out.println("Dtipping coffee through filter");
    }

    public void addCondiment() {
        System.out.println("Adding sugar and milk");
    }
}
