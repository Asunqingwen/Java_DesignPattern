package SingletonPattern;

/**
 * @projectName: Java_DesignPattern
 * @description: 单例模式
 * @author: 小新
 * @date: 2022-06-15 14:38
 **/
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    //预防多线程破坏单例模式
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }
}
