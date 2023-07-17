package com.example.javafx_ui_controls_and_multimedia.ch20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestCollection {

    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.addAll(List.of("New York", "Atlanta", "Dallas", "Madison"));
//        for(int i = 0; i < collection1.size(); i++){
//            System.out.println(collection1.get(i));
//        }

        System.out.println(collection1);
        System.out.println();
        System.out.println("Is Dallas in the collection? " + collection1.contains("Dallas"));

        Collection<String> collection2 = new ArrayList<>();
        collection2.addAll(List.of("Seattle", "Portland", "Los Angeles", "Atlanta"));
        System.out.println(collection2);

        ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
        c1.addAll(collection2);
        System.out.println("\nCities in collection1 or collect2");
        System.out.println(c1);

        c1 = (ArrayList<String>)(collection1.clone());
        c1.retainAll(collection2);
        System.out.println("\nCities in collection1 and collection2");
        System.out.println(c1);

        c1 = (ArrayList<String>)(collection1.clone());
        c1.removeAll(collection2);
        System.out.println("\nCities in collection1, but not in 2:");
        System.out.println(c1);

    }
}
