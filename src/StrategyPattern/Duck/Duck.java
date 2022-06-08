package StrategyPattern.Duck;

import StrategyPattern.FlyBehavior.FlyBehavior;
import StrategyPattern.QuackBehavior.QuackBehavior;

/**
 * @projectName: DesignPattern
 * @description: 鸭子类
 * @author: 小新
 * @date: 2022-06-06 15:20
 **/
public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float,even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
