package CompoundPattern.Duck;

import CompoundPattern.Quack.Quackable;

/**
 * @projectName: Java_DesignPattern
 * @description: 鸭鸣器
 * @author: 小新
 * @date: 2022-07-21 13:48
 **/
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
