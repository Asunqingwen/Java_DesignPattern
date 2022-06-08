package StrategyPattern.QuackBehavior;

/**
 * @projectName: DesignPattern
 * @description: 呱呱叫实现类
 * @author: 小新
 * @date: 2022-06-06 16:51
 **/
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
