package org.collections.arraylisttest;

import org.collections.arraylist.Dress;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Boutique {
    public static void main(String[] args) {
        List<Dress> clothes = new ArrayList<>();
        Dress d1 = new Dress(12,"janu","L",4,"frock");
        Dress d2 = new Dress(16,"malar","XL",9,"lehanga");
        Dress d3 = new Dress(42,"arzoo","XS",2,"jeans");
        Dress d4 = new Dress(39,"kedhar","M",7,"skirt");

        clothes.add(d1);
        clothes.add(d2);
        clothes.add(d3);
        clothes.add(d4);
        clothes.remove(0);
        Iterator<Dress> i = clothes.iterator();
        while (i.hasNext())
            System.out.println(i.next().designer);
        clothes.add(2,d1);
        for(Dress itr : clothes)
            System.out.println(itr.designer+" "+itr.quantity+" "+itr.model+" "+itr.size+" "+itr.id);

    }
}
