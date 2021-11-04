package org.oops.polymorphism;

public class AddArea {
    public double addingAreas(Measurable m1, Measurable m2){
        double area1= m1.calculateArea();
        double area2 = m2.calculateArea();
        return area1+area2;
    }
}
