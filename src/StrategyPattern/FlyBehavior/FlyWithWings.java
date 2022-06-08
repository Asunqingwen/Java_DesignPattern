package StrategyPattern.FlyBehavior;

/**
 * @projectName: DesignPattern
 * @description: 会飞的实现类
 * @author: 小新
 * @date: 2022-06-06 16:24
 **/
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly(){
        System.out.println("I'm flying!");
    }
}
