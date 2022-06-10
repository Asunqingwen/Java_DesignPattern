package ObserverPattern.Subject;

import ObserverPattern.Observer.Observer;

/**
 * @projectName: Java_DesignPattern
 * @description: 主题接口
 * @author: 小新
 * @date: 2022-06-08 15:36
 **/
public interface Subject {
    public void registerObserver( Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
