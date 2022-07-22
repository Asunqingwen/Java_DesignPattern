package StatePattern.StateInterface;

/**
 * @projectName: Java_DesignPattern
 * @description: 状态接口
 * @author: 小新
 * @date: 2022-07-19 14:01
 **/
public interface State {
    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
