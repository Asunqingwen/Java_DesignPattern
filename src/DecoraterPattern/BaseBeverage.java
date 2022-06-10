package DecoraterPattern;

/**
 * @projectName: Java_DesignPattern
 * @description: 基类
 * @author: 小新
 * @date: 2022-06-09 17:25
 **/
public abstract class BaseBeverage {

    public String description = "Unknown BaseBeverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
