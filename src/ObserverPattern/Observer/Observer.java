package ObserverPattern.Observer;

/**
 * @projectName: Java_DesignPattern
 * @description: 观察者接口
 * @author: 小新
 * @date: 2022-06-08 15:37
 **/
public interface Observer {
    public void update(float temperature,float humidity,float pressure);
}
