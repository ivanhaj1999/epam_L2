package org.oops.polymorphism;

public class Rectangle implements Measurable{
    int length;
    int breadth;
    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double calculateArea(){
        double area = length*breadth;
        System.out.println("The area of a rectangle is = "+area);
        return area;
    }
    public double calculatePerimeter(){
        double perimeter = 2*(length+breadth);
        System.out.println("The perimeter of a rectangle is = "+perimeter);
        return perimeter;
    }
}
