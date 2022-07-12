package IteratorPattern;

import IteratorPattern.Iterator.DinerMenuIterator;
import IteratorPattern.Menu.CafeMenu;
import IteratorPattern.Menu.PancakeHouseMenu;
import IteratorPattern.Menu.DinerMenu;

/**
 * @projectName: Java_DesignPattern
 * @description: 主函数
 * @author: 小新
 * @date: 2022-06-30 15:03
 **/
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
