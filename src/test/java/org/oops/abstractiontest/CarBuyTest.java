package org.oops.abstractiontest;

import org.oops.abstraction.Audi;
import org.oops.abstraction.Car;
import org.oops.abstraction.Kia;
import org.oops.abstraction.Nano;

import java.util.Scanner;

public class CarBuyTest {
    public static void main(String []args){



    System.out.println("Enter the name of the car brand given");
    System.out.println("audi,kia,nano");
    Scanner sc= new Scanner(System.in);
    String carName =sc.next();
    Car q1 = new Audi("audi Q1",35,4600000);
    Car q2 = new Audi("audi Q2",33,4900000);
    Car k1 = new Kia("kia k1",27,2700000);
    Car k2 = new Kia("kia K2",25,2300000);
    Car n1 = new Nano("nano N1",23,900000);
    Car n2 = new Nano("nano N2",20,700000);

    q1.setCost(450000);
    q1.getCost();

    switch(carName.toLowerCase()){
        case "audi":
            System.out.println("Displaying the "+carName+" car specifications");
            q1.display();
            q2.display();
            break;
        case "kia":
            System.out.println("Displaying the "+carName+" car specifications");
            k1.display();
            k2.display();
            break;
        case"nano":
            System.out.println("Displaying the "+carName+" car specifications");
            n1.display();
            n2.display();
            break;
        default: System.out.println("Entered "+carName+" car is not available");
    }

}
}