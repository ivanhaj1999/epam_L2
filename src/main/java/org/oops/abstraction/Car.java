package org.oops.abstraction;

public abstract class Car {
    public int cost;
    public int milage;
    public String model;
    public int getCost() {
        return cost;
    }

    public void setCost(int cost){
        if(cost>=500000 && cost<=5000000)
            this.cost = cost;
        else if(cost<500000)
            System.out.println("minimum cost of the car is 5 lakhs");
        else
            System.out.println("maximum cost of the car available is 50 lakhs");

    }
    public abstract String getCarBrand();
    public abstract double getDiscountRate(int cost);
    public abstract void display();
}
