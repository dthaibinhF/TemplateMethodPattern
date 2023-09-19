package TemplateMethod;

public abstract class CaffeineBeverage {
    final public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiment()) addCondiment();
    }

    abstract public void brew();
    abstract public void addCondiment();
    public void boilWater() {
        System.out.println("Boiling water");
    }
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public boolean customerWantsCondiment(){ //this is a hook
        return true;
    }
}
