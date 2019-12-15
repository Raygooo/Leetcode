package DesignPattern.Decorator;

/**
 * Class DecoratorPatternDemo is created on 2019/12/13 12:00.
 *
 * @author Ray
 * @version 2019/12/13
 **/

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape Circle = new Circle();
//        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
//        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        Circle.draw();

        System.out.println("Circle with red border");
        redCircle.draw();

        System.out.println("Rectangle with red border");
        redRectangle.draw();
    }
}
