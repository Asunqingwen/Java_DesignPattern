package StrategyPattern.FlyBehavior;

/**
 * @projectName: DesignPattern
 * @description: 不会飞实现类
 * @author: 小新
 * @date: 2022-06-06 16:27
 **/
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
