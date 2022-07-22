package CompoundPattern.Factory;

import CompoundPattern.Duck.DuckCall;
import CompoundPattern.Duck.MallardDuck;
import CompoundPattern.Duck.RedhaedDuck;
import CompoundPattern.Duck.RubberDuck;
import CompoundPattern.Quack.Quackable;

/**
 * @projectName: Java_DesignPattern
 * @description: 鸭子工厂
 * @author: 小新
 * @date: 2022-07-21 14:35
 **/
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedhaedDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
