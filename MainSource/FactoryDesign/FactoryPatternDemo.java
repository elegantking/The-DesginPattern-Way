package DesignPatterns.FactoryDesign;

import sun.security.provider.SHA;

/**
 * Created by psxjo on 2017/2/14.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //get an object of Circle and call its draw method;
        Shape shape = shapeFactory.getShape("CIRCLE");
        //call drwa method of Circle
        shape.draw();
        //get an object of Rectangle and call tis draw method;
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        //call draw method of Rectangle
        shape1.draw();
    }
}
