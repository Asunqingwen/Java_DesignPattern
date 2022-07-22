package CompoundPattern.Duck;

import CompoundPattern.Quack.Quackable;

/**
 * @projectName: Java_DesignPattern
 * @description: 绿头鸭
 * @author: 小新
 * @date: 2022-07-21 13:46
 **/
public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
