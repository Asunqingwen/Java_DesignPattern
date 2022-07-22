package CompoundPattern.Duck;

import CompoundPattern.Quack.Quackable;

/**
 * @projectName: Java_DesignPattern
 * @description: 橡皮鸭
 * @author: 小新
 * @date: 2022-07-21 13:49
 **/
public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
