package DesignPattern.Factory;

/**
 * Class Square is created on 2019/12/12 21:39.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
