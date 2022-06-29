package TemplateMethodPattern;

/**
 * @projectName: Java_DesignPattern
 * @description: 咖啡类
 * @author: 小新
 * @date: 2022-06-29 13:24
 **/
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
