package StrategyPattern.Duck;

import StrategyPattern.FlyBehavior.FlyNoWay;
import StrategyPattern.QuackBehavior.Quack;

/**
 * @projectName: DesignPattern
 * @description: 模型鸭实体类
 * @author: 小新
 * @date: 2022-06-06 17:06
 **/
public class ModelDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
