package DesignPattern.Factory;

/**
 * Class Factory is created on 2019/12/12 21:35.
 *
 * @author Ray
 * @version 2019/12/12
 **/

public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;
        if (shapeType.equals("CIRCLE"))
            return new Circle();
        if (shapeType.equals("RECTANGLE"))
            return new Rectangle();
        if (shapeType.equals("SQUARE"))
            return new Square();
        return null;
    }
}


