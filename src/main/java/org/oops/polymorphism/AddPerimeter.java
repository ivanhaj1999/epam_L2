package org.oops.polymorphism;

public class AddPerimeter {
    public double addingPerimeters(Measurable m1, Measurable m2){
        double peri1= m1.calculatePerimeter();
        double peri2 = m2.calculatePerimeter();
        return peri1+peri2;
    }
}
