package com.example.javafx_ui_controls_and_multimedia.ch21;

import java.util.LinkedHashSet;

public class ShowOutput2 {
    public static void main(String[] args){
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("New York");
        LinkedHashSet<String> set2 = set1;
        System.out.println(set2 + " hello ");
        LinkedHashSet<String> set3 = (LinkedHashSet<String>)(set1.clone());

        System.out.println("Set1 is " + set1);
        System.out.println("Set2 is !!! " + set2);
        set1.add("Atlanta");
        System.out.println("Set3 is " + set3);
        System.out.println(set1);
        System.out.println(set2);
        set1.forEach(e -> System.out.println(e + " "));
    }
}
