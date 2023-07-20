package com.example.javafx_ui_controls_and_multimedia.ch21;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {


        Set<String> set = new HashSet<>();
        //add strings to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        //The set does not allow duplicates, so New York is only stored once.
        //Also, when the strings print out, they are not stored in the order that they are added in.
        // To impose an order you need a LinkedHashSet


        System.out.println(set);

        //Display elements in a hashset
        for (String s : set) {
            System.out.print(s.toUpperCase() + " ");
        }

        //process elements using a forEach method
        System.out.println();
        set.forEach(e -> System.out.print(e.toLowerCase() + " "));

    }
}
