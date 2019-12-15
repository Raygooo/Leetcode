package DesignPattern.Observer;

/**
 * Class OctalObserver is created on 2019/12/13 12:22.
 *
 * @author Ray
 * @version 2019/12/13
 **/

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
