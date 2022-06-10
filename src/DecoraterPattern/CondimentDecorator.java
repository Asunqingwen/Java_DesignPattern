package DecoraterPattern;

/**
 * @projectName: Java_DesignPattern
 * @description: 装饰类
 * @author: 小新
 * @date: 2022-06-09 17:29
 **/
public abstract class CondimentDecorator extends BaseBeverage {
    @Override
    public abstract String getDescription();
}
