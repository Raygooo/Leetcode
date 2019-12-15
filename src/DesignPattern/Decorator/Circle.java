package DesignPattern.Decorator;

/**
 * Class Circle is created on 2019/12/13 11:55.
 *
 * @author Ray
 * @version 2019/12/13
 **/

public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
