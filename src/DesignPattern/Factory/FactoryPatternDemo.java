package DesignPattern.Factory;

/**
 * Class FactoryPatternDemo is created on 2019/12/12 21:45.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public class FactoryPatternDemo {
    public static void main(String[] args) {

        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Rectangle rectangle = (Rectangle) shape2;
        rectangle.sayHello();

        Shape shape3 = ShapeFactory.getShape("SQUARE");
        shape3.draw();

    }
}
