package DesignPattern.Observer;

/**
 * Class BinaryObserver is created on 2019/12/13 12:20.
 *
 * @author Ray
 * @version 2019/12/13
 **/

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
