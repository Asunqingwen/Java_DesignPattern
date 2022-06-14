package FactoryPattern.PizzaFactory;

import FactoryPattern.Pizza.Pizza;

/**
 * @projectName: Java_DesignPattern
 * @description: 披萨店工厂
 * @author: 小新
 * @date: 2022-06-13 16:25
 **/
public abstract class PizzaStore {
    abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
