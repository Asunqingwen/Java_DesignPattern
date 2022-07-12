package IteratorPattern.Menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @projectName: Java_DesignPattern
 * @description: 煎饼屋菜单
 * @author: 小新
 * @date: 2022-06-29 17:02
 **/
public class PancakeHouseMenu implements Menu{
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs,and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs,sausage", false, 2.99);
        addItem("Blueberry Pancake", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
