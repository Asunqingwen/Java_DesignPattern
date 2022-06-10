package DecoraterPattern;

import DecoraterPattern.Beverage.DarkRoast;
import DecoraterPattern.Beverage.Espresso;
import DecoraterPattern.Beverage.HouseBlend;
import DecoraterPattern.Condiment.Mocha;
import DecoraterPattern.Condiment.Soy;
import DecoraterPattern.Condiment.Whip;

/**
 * @projectName: Java_DesignPattern
 * @description: 主函数
 * @author: 小新
 * @date: 2022-06-10 10:12
 **/
public class StarbuzzCoffee {
    public static void main(String[] args) {
        BaseBeverage baseBeverage = new Espresso();
        System.out.println(baseBeverage.getDescription() + " $" + baseBeverage.cost());

        BaseBeverage baseBeverage1 = new DarkRoast();
        baseBeverage1 = new Mocha(baseBeverage1);
        baseBeverage1 = new Mocha(baseBeverage1);
        baseBeverage1 = new Whip(baseBeverage1);
        System.out.println(baseBeverage1.getDescription() + " $" + baseBeverage1.cost());

        BaseBeverage baseBeverage2 = new HouseBlend();
        baseBeverage2 = new Soy(baseBeverage2);
        baseBeverage2 = new Mocha(baseBeverage2);
        baseBeverage2 = new Whip(baseBeverage2);
        System.out.println(baseBeverage2.getDescription() + " $" + baseBeverage2.cost());
    }
}
