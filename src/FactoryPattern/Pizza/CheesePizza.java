package FactoryPattern.Pizza;

import FactoryPattern.IngredientFactory.PizzaIngredientFactory;

/**
 * @projectName: Java_DesignPattern
 * @description: 干酪披萨
 * @author: 小新
 * @date: 2022-06-14 13:25
 **/
public class CheesePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;
    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);

        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
