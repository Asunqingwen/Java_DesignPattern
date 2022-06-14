package FactoryPattern.PizzaFactory;

import FactoryPattern.IngredientFactory.ChicagoIngredientFactory;
import FactoryPattern.IngredientFactory.NYIngredientFactory;
import FactoryPattern.IngredientFactory.PizzaIngredientFactory;
import FactoryPattern.Pizza.*;

/**
 * @projectName: Java_DesignPattern
 * @description: 芝加哥披萨店
 * @author: 小新
 * @date: 2022-06-13 17:08
 **/
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoIngredientFactory();
        if ("cheese".equals(item)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if ("pepperoni".equals(item)) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        } else if ("clam".equals(item)) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if ("veggie".equals(item)) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }
        return pizza;
    }
}
