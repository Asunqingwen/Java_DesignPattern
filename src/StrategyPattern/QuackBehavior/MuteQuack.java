package StrategyPattern.QuackBehavior;

/**
 * @projectName: DesignPattern
 * @description: 不叫实现类
 * @author: 小新
 * @date: 2022-06-06 16:56
 **/
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
