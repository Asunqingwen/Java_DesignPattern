package CompoundPattern.Quack;

/**
 * @projectName: Java_DesignPattern
 * @description: 呱呱叫计数器
 * @author: 小新
 * @date: 2022-07-21 14:11
 **/
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }
}
