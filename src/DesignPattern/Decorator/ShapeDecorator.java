package DesignPattern.Decorator;

/**
 * Class ShapeDecorator is created on 2019/12/13 11:56.
 *
 * @author Ray
 * @version 2019/12/13
 **/

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
