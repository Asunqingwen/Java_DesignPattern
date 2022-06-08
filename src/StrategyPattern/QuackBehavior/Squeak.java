package StrategyPattern.QuackBehavior;

/**
 * @projectName: DesignPattern
 * @description: 吱吱叫实现类
 * @author: 小新
 * @date: 2022-06-06 16:53
 **/
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
