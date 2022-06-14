package FactoryPattern.Pizza;

import FactoryPattern.Ingredient.*;

import java.util.ArrayList;

/**
 * @projectName: Java_DesignPattern
 * @description: 披萨类
 * @author: 小新
 * @date: 2022-06-13 16:16
 **/
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name){
        this.name = name;
    }

    String getName() {
        return name;
    }
}
