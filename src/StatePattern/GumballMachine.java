package StatePattern;

import StatePattern.StateInterface.*;

/**
 * @projectName: Java_DesignPattern
 * @description: 糖果机
 * @author: 小新
 * @date: 2022-07-18 09:55
 **/
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\nMighty Gumball Inc.\n");
        stringBuffer.append("Java-enabled Standing Gumball Model #2004\n");
        stringBuffer.append("Inventory: ").append(this.count).append(" gumballs\n");
        if (this.count == 0) {
            stringBuffer.append("Machine is sold out\n");
        } else {
            stringBuffer.append("Machine is waiting for quarter\n");
        }
        return stringBuffer.toString();
    }
}
