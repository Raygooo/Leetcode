package DesignPattern.Observer;

/**
 * Class HexaObserver is created on 2019/12/13 12:24.
 *
 * @author Ray
 * @version 2019/12/13
 **/

public class HexObserver extends Observer{
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
    }
}
