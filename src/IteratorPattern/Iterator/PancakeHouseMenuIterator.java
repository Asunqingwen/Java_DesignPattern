package IteratorPattern.Iterator;

import IteratorPattern.Menu.MenuItem;

import java.util.ArrayList;

/**
 * @projectName: Java_DesignPattern
 * @description: 煎饼屋餐厅菜单迭代器
 * @author: 小新
 * @date: 2022-06-30 10:44
 **/
public class PancakeHouseMenuIterator implements IteratorInter {
    ArrayList menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < this.menuItems.size() && this.menuItems.get(position) != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) this.menuItems.get(position);
        position += 1;
        return menuItem;
    }
}
