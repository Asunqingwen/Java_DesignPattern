package StrategyPattern.Duck;

import StrategyPattern.Duck.Duck;
import StrategyPattern.FlyBehavior.FlyWithWings;
import StrategyPattern.QuackBehavior.Quack;

/**
 * @projectName: DesignPattern
 * @description: 具体鸭子实现类
 * @author: 小新
 * @date: 2022-06-06 15:22
 **/
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
