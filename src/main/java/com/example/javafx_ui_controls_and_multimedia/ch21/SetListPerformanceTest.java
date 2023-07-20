package com.example.javafx_ui_controls_and_multimedia.ch21;

import java.util.ArrayList;
import java.util.*;

//At 50000
//Member test time for hash set is 10 milliseconds
//Remove element time for hash set is 13 milliseconds
//Member test time for linked hash set is 6 milliseconds
//Remove element time for linked hash set is 15 milliseconds
//Memeber test time for tree set is 39 milliseconds
//Remove element time for tree set is 44 milliseconds
//Memeber test time for array list is 2819 milliseconds
//Remove element time for array list is 755 milliseconds
//Memeber test time for linked list is 5641 milliseconds
//Remove element time for linked list is 2240 milliseconds

//At 60000
//Member test time for hash set is 15 milliseconds
//Remove element time for hash set is 17 milliseconds
//Member test time for linked hash set is 4 milliseconds
//Remove element time for linked hash set is 28 milliseconds
//Memeber test time for tree set is 27 milliseconds
//Remove element time for tree set is 30 milliseconds
//Memeber test time for array list is 1073 milliseconds
//Remove element time for array list is 3109 milliseconds
//Memeber test time for linked list is 1610 milliseconds
//Remove element time for linked list is 3983 milliseconds


public class SetListPerformanceTest {
    static final int N = 60000;

    public static void main(String[] args){
        //add numbers 0, 1, 2, ..., N - 1 to the array list
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++){
            list.add(i);
        }
        Collections.shuffle(list); // shuffle the arraylist

        //create a hash set, and test its performance
        Collection<Integer> set1 = new HashSet<>(list);
        System.out.println("Member test time for hash set is " + getTestTime(set1) + " milliseconds");
        System.out.println("Remove element time for hash set is " + getRemoveTime(set1) + " milliseconds");

        //create a linked hash set, and test its performance
        Collection<Integer> set2 = new LinkedHashSet<>(list);
        System.out.println("Member test time for linked hash set is " + getTestTime(set2) + " milliseconds");
        System.out.println("Remove element time for linked hash set is " + getRemoveTime(set2) + " milliseconds");

        Collection<Integer> set3 = new TreeSet<>(list);
        System.out.println("Memeber test time for tree set is " + getTestTime(set3) + " milliseconds");
        System.out.println("Remove element time for tree set is " + getRemoveTime(set3) + " milliseconds");

        //Create an arraylist
        Collection<Integer> list1 = new ArrayList<>(list);
        System.out.println("Memeber test time for array list is " + getTestTime(list1) + " milliseconds");
        System.out.println("Remove element time for array list is " + getRemoveTime(list1) + " milliseconds");

        //Linked List
        Collection<Integer> list2 = new LinkedList<>(list);
        System.out.println("Memeber test time for linked list is " + getTestTime(list2) + " milliseconds");
        System.out.println("Remove element time for linked list is " + getRemoveTime(list2) + " milliseconds");

    }

    public static long getTestTime(Collection<Integer> c){
        long startTime = System.currentTimeMillis();

        //test if a number is in the collection
        for (int i = 0; i < N; i++){
            c.contains((int) Math.random() * 2 * N);
        }
        return System.currentTimeMillis() - startTime;
    }

    public static long getRemoveTime(Collection<Integer> c){
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < N; i++){
            c.remove(i);
        }
        return System.currentTimeMillis() - startTime;
    }
}
