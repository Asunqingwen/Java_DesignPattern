package TemplateMethodPattern;

/**
 * @projectName: Java_DesignPattern
 * @description: 茶类
 * @author: 小新
 * @date: 2022-06-29 13:31
 **/
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
