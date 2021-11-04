package org.oops.abstraction;

public class Nano extends Car{
    public Nano(String model, int milage, int cost){
        this.model = model;
        this.milage=milage;
        this.cost=cost;
    }
    public String getCarBrand() {
        return  "Nano";
    }

    public double getDiscountRate(int cost) {
        return (cost*0.05);
    }


    public void display(){
        System.out.println("car name is "+getCarBrand());
        System.out.println("car model "+model);
        System.out.println("car milage "+milage);
        System.out.println("car cost "+cost);
        double price = cost-getDiscountRate(cost);
        System.out.println("car price after discount "+price);
        System.out.println();
    }
}
