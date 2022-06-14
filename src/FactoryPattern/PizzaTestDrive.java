package FactoryPattern;

import FactoryPattern.PizzaFactory.ChicagoPizzaStore;
import FactoryPattern.PizzaFactory.NYPizzaStore;
import FactoryPattern.PizzaFactory.PizzaStore;
import FactoryPattern.Pizza.Pizza;

/**
 * @projectName: Java_DesignPattern
 * @description: 主函数
 * @author: 小新
 * @date: 2022-06-14 10:21
 **/
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        nyStore.orderPizza("cheese");

        chicagoStore.orderPizza("cheese");
    }
}
