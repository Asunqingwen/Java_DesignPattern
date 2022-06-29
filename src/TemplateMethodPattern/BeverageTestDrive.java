package TemplateMethodPattern;

/**
 * @projectName: Java_DesignPattern
 * @description: 主函数
 * @author: 小新
 * @date: 2022-06-29 14:18
 **/
public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaWithHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
