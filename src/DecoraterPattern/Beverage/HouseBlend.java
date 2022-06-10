package DecoraterPattern.Beverage;

import DecoraterPattern.BaseBeverage;

/**
 * @projectName: Java_DesignPattern
 * @description: 综合咖啡
 * @author: 小新
 * @date: 2022-06-09 17:40
 **/
public class HouseBlend extends BaseBeverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
