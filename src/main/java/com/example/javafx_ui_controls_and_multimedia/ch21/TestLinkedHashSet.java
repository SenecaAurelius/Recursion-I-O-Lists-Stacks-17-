package com.example.javafx_ui_controls_and_multimedia.ch21;

import java.util.*;
public class TestLinkedHashSet {
    public static void main(String[] args){
        Set<String> set = new LinkedHashSet<>(Arrays.asList("London", "Paris", "New York", "San Francisco", "Beijing", "New York"));

        System.out.println(set);

        for(String element : set){
            System.out.print(element.toLowerCase() + " ");
        }
        System.out.println();
        set.forEach(e -> System.out.print(e.toUpperCase() + " "));

        //Use a hashset if you don't need order, it's more efficient that a LinkedHashSet.
    }
}
