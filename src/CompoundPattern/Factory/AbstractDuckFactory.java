package CompoundPattern.Factory;

import CompoundPattern.Quack.Quackable;

/**
 * @projectName: Java_DesignPattern
 * @description: 鸭子抽象工厂
 * @author: 小新
 * @date: 2022-07-21 14:32
 **/
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
