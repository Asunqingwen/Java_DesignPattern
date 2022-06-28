package AdapterPattern.Adapter;

import AdapterPattern.Duck.Duck;
import AdapterPattern.Turkey.Turkey;

/**
 * @projectName: Java_DesignPattern
 * @description: TurkeyAdapter
 * @author: 小新
 * @date: 2022-06-24 14:46
 **/
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
