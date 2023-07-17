package com.example.javafx_ui_controls_and_multimedia.ch20;

import java.util.List;
import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);

        List<String> strList = Arrays.asList("red", "yellow", "blue");
        List<String> strList2 = Arrays.asList("red", "yellow", "green");

//        strList.add(strList2);
        System.out.println(strList);

    }
}
