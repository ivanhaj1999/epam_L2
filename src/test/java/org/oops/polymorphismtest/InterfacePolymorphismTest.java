package org.oops.polymorphismtest;

import org.oops.polymorphism.*;

public class InterfacePolymorphismTest {
    public static void main(String []args){
        Rectangle rect1 = new Rectangle(10,5);
        Rectangle rect2 = new Rectangle(10,6);
        Circle circle1 = new Circle(7);
        Circle circle2 = new Circle(14);
        AddArea addArea = new AddArea();
        double areaAdded = addArea.addingAreas(rect1,circle2);
        System.out.println("total area added = "+areaAdded);

        AddPerimeter addPerimeter = new AddPerimeter();

        double periAdded = addPerimeter.addingPerimeters(circle1,rect2);
        System.out.println("total perimeter added = "+periAdded);

        Measurable m1 = new Rectangle(12,4);
        m1.calculateArea();
        m1.calculatePerimeter();

        Measurable m2 = new Circle(7);
        m2.calculateArea();
        m2.calculatePerimeter();

    }
}
