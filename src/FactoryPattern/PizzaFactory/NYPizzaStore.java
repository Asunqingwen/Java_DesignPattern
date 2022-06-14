package FactoryPattern.PizzaFactory;

import FactoryPattern.IngredientFactory.NYIngredientFactory;
import FactoryPattern.IngredientFactory.PizzaIngredientFactory;
import FactoryPattern.Pizza.*;

/**
 * @projectName: Java_DesignPattern
 * @description: 纽约披萨店
 * @author: 小新
 * @date: 2022-06-13 16:48
 **/
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYIngredientFactory();
        if ("cheese".equals(item)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if ("pepperoni".equals(item)) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } else if ("clam".equals(item)) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if ("veggie".equals(item)) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        return pizza;
    }
}
