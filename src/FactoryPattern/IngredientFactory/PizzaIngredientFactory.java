package FactoryPattern.IngredientFactory;

import FactoryPattern.Ingredient.*;

/**
 * @projectName: Java_DesignPattern
 * @description: 原料工厂
 * @author: 小新
 * @date: 2022-06-14 10:56
 **/
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
