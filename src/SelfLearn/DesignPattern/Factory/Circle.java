package SelfLearn.DesignPattern.Factory;

/**
 * Class Circle is created on 2019/12/12 21:40.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
