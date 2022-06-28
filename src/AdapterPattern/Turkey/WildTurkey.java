package AdapterPattern.Turkey;

import AdapterPattern.Turkey.Turkey;

/**
 * @projectName: Java_DesignPattern
 * @description: 野火鸡类
 * @author: 小新
 * @date: 2022-06-24 14:45
 **/
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
