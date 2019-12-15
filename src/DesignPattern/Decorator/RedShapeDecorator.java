package DesignPattern.Decorator;

/**
 * Class RedShapDecorator is created on 2019/12/13 11:57.
 *
 * @author Ray
 * @version 2019/12/13
 **/

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
