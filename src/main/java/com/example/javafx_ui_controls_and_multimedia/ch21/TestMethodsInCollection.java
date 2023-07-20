package com.example.javafx_ui_controls_and_multimedia.ch21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class TestMethodsInCollection {
    public static void main(String[] args){
        Set<String> set1 = new HashSet<>(Arrays.asList("London", "Paris", "New York", "San Francisco", "Beijing"));

        //add strings to set1
        //set1.add("London");
        //set1.add(Arrays.asList("Paris", "New York", "San Francisco", "Beijing"));
        //validStates = new HashSet<String>(Arrays.asList("AL", "AK", ".."));
        //variableName = new HashSet<String>(Arrays.asList("str1", "str2", "str3");

        System.out.println("Set1 is " + set1);
        System.out.println("There are " + set1.size() + " elements in set1.");

        //delete a string from set1
        set1.remove("London");
        System.out.println("\nset1 is now " + set1);
        System.out.println("There are now " + set1.size() + " elements in set1");

        Set<String> set2 = new HashSet<>(Arrays.asList("London", "Shanghai", "Paris"));
        set2.add("london");
        set2.add("Shanghai");
        set2.add("Paris");
        set2.add("Hello");

        System.out.println("\nSet2 is composed of " + set2);
        System.out.println("There are " + set2.size() + " elements in set2.");

        System.out.println("Is Taipei in set2? " + set2.contains("Taipei"));

        set1.addAll(set2);
        System.out.println("\nAfter adding set2 to set1, set1 is now composed of " + set1);

        set1.removeAll(set2);
        System.out.println("After removing set2 from set1, set1 is " + set1);

        set1.retainAll(set2);
        System.out.println("After retaining common elements in set2 and set1, set1 is " + set1);


    }
}
