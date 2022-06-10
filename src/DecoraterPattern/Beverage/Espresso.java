package DecoraterPattern.Beverage;

import DecoraterPattern.BaseBeverage;

/**
 * @projectName: Java_DesignPattern
 * @description: 浓缩咖啡
 * @author: 小新
 * @date: 2022-06-09 17:32
 **/
public class Espresso extends BaseBeverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
