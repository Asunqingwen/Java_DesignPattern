package FactoryPattern.Pizza;

import FactoryPattern.IngredientFactory.PizzaIngredientFactory;

/**
 * @projectName: Java_DesignPattern
 * @description: 蛤蜊披萨
 * @author: 小新
 * @date: 2022-06-14 13:31
 **/
public class ClamPizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;
    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);

        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClam();
    }
}
