package IteratorPattern.Iterator;

import IteratorPattern.Menu.MenuItem;

import java.util.Iterator;
import java.util.List;

/**
 * @projectName: Java_DesignPattern
 * @description: DinerMenuIterator
 * @author: 小新
 * @date: 2022-06-30 10:39
 **/
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (items[position - 1] != null) {
            if (items.length - 1 - position - 1 >= 0) {
                System.arraycopy(items, position, items, position - 1, items.length - 1 - position - 1);
            }
            items[items.length - 1] = null;
        }
    }
}
