package DecoraterPattern.Condiment;

import DecoraterPattern.BaseBeverage;
import DecoraterPattern.CondimentDecorator;

/**
 * @projectName: Java_DesignPattern
 * @description: 豆浆
 * @author: 小新
 * @date: 2022-06-09 18:17
 **/
public class Soy extends CondimentDecorator {
    BaseBeverage baseBeverage;

    public Soy(BaseBeverage baseBeverage) {
        this.baseBeverage = baseBeverage;
    }

    @Override
    public String getDescription() {
        return baseBeverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + baseBeverage.cost();
    }
}
