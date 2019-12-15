package SelfLearn.DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Subject is created on 2019/12/13 12:16.
 *
 * @author Ray
 * @version 2019/12/13
 **/

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }


}
