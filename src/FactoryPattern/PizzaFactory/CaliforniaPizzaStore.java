package FactoryPattern.PizzaFactory;

import FactoryPattern.IngredientFactory.CaliforniaIngredientFactory;
import FactoryPattern.IngredientFactory.NYIngredientFactory;
import FactoryPattern.IngredientFactory.PizzaIngredientFactory;
import FactoryPattern.Pizza.*;

/**
 * @projectName: Java_DesignPattern
 * @description: 加州披萨店
 * @author: 小新
 * @date: 2022-06-13 17:57
 **/
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new CaliforniaIngredientFactory();
        if ("cheese".equals(item)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("California Style Cheese Pizza");
        } else if ("pepperoni".equals(item)) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("California Style Pepperoni Pizza");
        } else if ("clam".equals(item)) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("California Style Clam Pizza");
        } else if ("veggie".equals(item)) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("California Style Veggie Pizza");
        }
        return pizza;
    }
}
