package DecoraterPattern.Beverage;

import DecoraterPattern.BaseBeverage;

/**
 * @projectName: Java_DesignPattern
 * @description: 低咖啡因
 * @author: 小新
 * @date: 2022-06-09 18:02
 **/
public class Decat extends BaseBeverage {
    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
