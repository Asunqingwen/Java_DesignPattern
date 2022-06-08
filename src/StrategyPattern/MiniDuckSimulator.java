package StrategyPattern;

import StrategyPattern.Duck.Duck;
import StrategyPattern.Duck.MallardDuck;
import StrategyPattern.Duck.ModelDuck;
import StrategyPattern.FlyBehavior.FlyRocketPowered;

/**
 * @projectName: DesignPattern
 * @description: 策略模式
 * @author: 小新
 * @date: 2022-06-06 15:19
 **/
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
