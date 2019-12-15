package DesignPattern.Observer;

/**
 * Class ObserverPatternDemo is created on 2019/12/13 12:26.
 *
 * @author Ray
 * @version 2019/12/13
 **/

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
