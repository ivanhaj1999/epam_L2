package org.oops.polymorphism;

public class Circle implements Measurable{
    int radius;

    public Circle(int radius){
        this.radius=radius;

    }
    public double calculateArea(){
        double  area = PI*radius*radius;
        System.out.println("The area of a circle is = "+area);
        return area;
    }
    public double calculatePerimeter(){
        double perimeter = 2*(PI*radius);
        System.out.println("The perimeter of a circle is = "+perimeter);
        return perimeter;
    }
}