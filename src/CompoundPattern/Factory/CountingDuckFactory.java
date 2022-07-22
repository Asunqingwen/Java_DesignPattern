package CompoundPattern.Factory;

import CompoundPattern.Duck.DuckCall;
import CompoundPattern.Duck.MallardDuck;
import CompoundPattern.Duck.RedhaedDuck;
import CompoundPattern.Duck.RubberDuck;
import CompoundPattern.Quack.QuackCounter;
import CompoundPattern.Quack.Quackable;

/**
 * @projectName: Java_DesignPattern
 * @description: 带装饰器的工厂
 * @author: 小新
 * @date: 2022-07-21 14:39
 **/
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedhaedDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
