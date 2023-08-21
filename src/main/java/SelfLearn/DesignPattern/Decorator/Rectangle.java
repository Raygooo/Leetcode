package SelfLearn.DesignPattern.Decorator;

/**
 * Class Rectangle is created on 2019/12/13 11:55.
 *
 * @author Ray
 * @version 2019/12/13
 **/

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
