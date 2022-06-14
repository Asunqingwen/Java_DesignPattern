package FactoryPattern.IngredientFactory;

import FactoryPattern.Ingredient.*;

/**
 * @projectName: Java_DesignPattern
 * @description: 加州原料工厂
 * @author: 小新
 * @date: 2022-06-14 13:41
 **/
public class CaliforniaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClam() {
        return null;
    }
}
