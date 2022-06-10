package DecoraterPattern.Beverage;

import DecoraterPattern.BaseBeverage;

/**
 * @projectName: Java_DesignPattern
 * @description: 深焙
 * @author: 小新
 * @date: 2022-06-09 17:43
 **/
public class DarkRoast extends BaseBeverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
