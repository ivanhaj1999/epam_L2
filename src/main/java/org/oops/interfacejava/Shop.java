package org.oops.interfacejava;

public class Shop implements Fruits,Flowers{
    public void costOfFruit(String fruitName){
        if(fruitName.equals("mango"))
            System.out.println("Cost of "+fruitName+" fruit is "+mango+" rupess");
        else
            System.out.println("Cost of "+fruitName+" fruit is "+apple+" rupess");

    }
    public void costOfFlower(String flowerName){
        if(flowerName.equals("mango"))
            System.out.println("Cost of "+flowerName+" flower is "+rose+" rupess");
        else
            System.out.println("Cost of "+flowerName+" flower is "+lily+" rupess");

    }
    public int totalCostOfItems(String fruitname, int fruits, String flowername, int flowers){
        if(fruitname == "apple" && flowername == "lily")
            return (fruits*apple)+(flowers*lily);
        else if(fruitname == "apple" && flowername == "rose")
            return (fruits*apple)+(flowers*rose);
        else if(fruitname == "mango" && flowername == "rose")
            return (fruits*mango)+(flowers*rose);
        else
            return (fruits*mango)+(flowers*lily);
    }
}
