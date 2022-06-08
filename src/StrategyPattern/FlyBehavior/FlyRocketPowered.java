package StrategyPattern.FlyBehavior;

/**
 * @projectName: DesignPattern
 * @description: 火箭动力的飞行行为
 * @author: 小新
 * @date: 2022-06-06 17:11
 **/
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
