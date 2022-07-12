package CompositePattern;

import java.util.Iterator;

/**
 * @projectName: Java_DesignPattern
 * @description: 空迭代器
 * @author: 小新
 * @date: 2022-07-12 08:20
 **/
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
