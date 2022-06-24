package AdapterPatternAndFacadePattern;

/**
 * @projectName: Java_DesignPattern
 * @description: 绿头鸭
 * @author: 小新
 * @date: 2022-06-24 14:42
 **/
public class MallardDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
