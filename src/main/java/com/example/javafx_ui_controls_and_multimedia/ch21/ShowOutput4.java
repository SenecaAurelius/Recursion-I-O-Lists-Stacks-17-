package com.example.javafx_ui_controls_and_multimedia.ch21;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ShowOutput4 {
    public static void main(String[] args){
        Set<String> set = new TreeSet<>(Comparator.comparing(String::length));
        set.add("ABC");
        set.add("ABD");
        System.out.println(set);
    }
}
