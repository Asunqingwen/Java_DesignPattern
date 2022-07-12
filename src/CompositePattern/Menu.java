package CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @projectName: Java_DesignPattern
 * @description: 菜单类
 * @author: 小新
 * @date: 2022-07-07 09:18
 **/
public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        for (Object component : menuComponents) {
            MenuComponent menuComponent = (MenuComponent) component;
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator(){
        return new CompositeIterator(menuComponents.iterator());
    }
}
