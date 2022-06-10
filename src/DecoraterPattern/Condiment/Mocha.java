package DecoraterPattern.Condiment;

import DecoraterPattern.BaseBeverage;
import DecoraterPattern.CondimentDecorator;

/**
 * @projectName: Java_DesignPattern
 * @description: 摩卡
 * @author: 小新
 * @date: 2022-06-09 18:13
 **/
public class Mocha extends CondimentDecorator {
    BaseBeverage baseBeverage;

    public Mocha(BaseBeverage baseBeverage) {
        this.baseBeverage = baseBeverage;
    }

    @Override
    public String getDescription() {
        return baseBeverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + baseBeverage.cost();
    }
}
