package com.example.javafx_ui_controls_and_multimedia.ch20;

import java.util.*;


public class Test2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 4, 7, 10, 11, 45, 50, 59, 60, 66);
        System.out.println("(1) Index : " + Collections.binarySearch(list1, 7));
        System.out.println("(2) Index : " + Collections.binarySearch(list1, 9));

        Collections.reverse(list1);
        System.out.println(list1);

        Collections.shuffle(list1);
        System.out.println(list1);

        List<String> list2 = Arrays.asList("blue", "green", "red");
        System.out.println("(3) Index : " + Collections.binarySearch(list2, "red"));
        System.out.println("(4) Index : " + Collections.binarySearch(list2, "cyan"));


        List<String> strList1 = Arrays.asList("yellow", "red", "green", "blue");
        List<String> strList2 = Arrays.asList("yellow", "red", "green", "blue");
        Collections.shuffle(strList1, new Random(21));
        Collections.shuffle(strList2, new Random(21));

        System.out.println(strList1);
        System.out.println(strList2);

        List<String> a = Arrays.asList("yellow", "red", "green", "blue");
        List<String> b = Arrays.asList("white", "black");
        Collections.copy(a, b);

        System.out.println(a);
        System.out.println(b);

        List<GregorianCalendar> calList = Collections.nCopies(5, new GregorianCalendar(2005, 0, 1));


    }
}
