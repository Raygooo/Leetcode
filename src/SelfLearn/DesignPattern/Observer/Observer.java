package SelfLearn.DesignPattern.Observer;

/**
 * Class Observer is created on 2019/12/13 12:17.
 *
 * @author Ray
 * @version 2019/12/13
 **/

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
