package com.example.javafx_ui_controls_and_multimedia.ch21;

import java.util.Arrays;
import java.util.HashSet;

public class ShowOutput {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>(Arrays.asList("Red", "Yellow", "Green"));
        HashSet<String> set2 = new HashSet<>(Arrays.asList("Red", "Yellow", "Blue"));
        System.out.println(set);
        System.out.println(set2);
        //set.addAll(set2);
        System.out.println(set);
        //set.removeAll(set2);
        //set.add(set2); requires a string as an argument, so set.add(set2) a collection, doesn't work
        set.retainAll(set2); // retainAll only keeps the common occurances between the two sets, so it should contain Red and Yellow, but neither Green nor Blue now
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}
