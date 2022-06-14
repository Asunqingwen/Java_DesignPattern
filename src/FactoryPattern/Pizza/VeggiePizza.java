package FactoryPattern.Pizza;

import FactoryPattern.IngredientFactory.PizzaIngredientFactory;

/**
 * @projectName: Java_DesignPattern
 * @description: 蔬菜披萨
 * @author: 小新
 * @date: 2022-06-14 13:35
 **/
public class VeggiePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;
    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);

        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
    }
}
