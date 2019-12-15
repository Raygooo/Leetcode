package DesignPattern.Factory;

/**
 * Class Rectangle is created on 2019/12/12 21:37.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

    public void sayHello(){
        System.out.println("Hello World");
    }
}
