package DecoraterPattern.Condiment;

import DecoraterPattern.BaseBeverage;
import DecoraterPattern.CondimentDecorator;

/**
 * @projectName: Java_DesignPattern
 * @description: 牛奶
 * @author: 小新
 * @date: 2022-06-09 18:18
 **/
public class Milk extends CondimentDecorator {
    BaseBeverage baseBeverage;

    public Milk(BaseBeverage baseBeverage) {
        this.baseBeverage = baseBeverage;
    }

    @Override
    public String getDescription() {
        return baseBeverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return .10 + baseBeverage.cost();
    }
}
