package TemplateMethodPattern;

/**
 * @projectName: Java_DesignPattern
 * @description: 咖啡因饮料类
 * @author: 小新
 * @date: 2022-06-29 13:41
 **/
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
