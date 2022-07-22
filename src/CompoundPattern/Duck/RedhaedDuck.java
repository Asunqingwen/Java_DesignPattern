package CompoundPattern.Duck;

import CompoundPattern.Quack.Quackable;

/**
 * @projectName: Java_DesignPattern
 * @description: 红头鸭
 * @author: 小新
 * @date: 2022-07-21 13:47
 **/
public class RedhaedDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
