package org.oops.interfacetest;

import org.oops.interfacejava.Shop;

import java.util.Scanner;

public class BuyItemsInShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruit name you want to purchase :");
        String fruit = sc.next();
        Shop shop = new Shop();
        int nofruit = 1;
        switch (fruit.toLowerCase()) {
            case "apple":
            case "mango":
                shop.costOfFruit(fruit);
                break;
            default:
                nofruit = 0;
                System.out.println("Entered " + fruit + " is not available");
        }

        System.out.println("Enter the flower name you want to purchase :");
        String flower = sc.next();
        int noflower = 1;
        switch (flower.toLowerCase()) {
            case "rose":
            case "lily":
                shop.costOfFlower(flower);
                break;
            default:
                noflower = 0;
                System.out.println("Entered " + flower + " is not available");
        }
        int noOfFruit = 0, noOfFlower = 0;
        if (nofruit == 1) {
            System.out.println("Enter number of " + fruit + " to be purchased : ");
            noOfFruit = sc.nextInt();
        }
        if (noflower == 1) {
            System.out.println("Enter number of " + flower + " to be purchased : ");
            noOfFlower = sc.nextInt();
        }
        int cost = shop.totalCostOfItems(fruit, noOfFruit, flower, noOfFlower);
        if (cost > 0)
            System.out.println("Total bill of purchased items : Rs." + cost + "/-");
        else
            System.out.println("You haven't purchased any items");
        System.out.println("Thanks for Shopping");
        System.out.println("Visit again");
    }
}
