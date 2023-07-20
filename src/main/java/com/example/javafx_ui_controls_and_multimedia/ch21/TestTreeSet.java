package com.example.javafx_ui_controls_and_multimedia.ch21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args){
        Set<String> set = new HashSet<>(Arrays.asList("London", "Paris", "New York", "San Francisco", "Beijing", "New York"));

        TreeSet<String> treeSet = new TreeSet<>(set);
        //tree sets use the comparable interface and it's compareTo method to sort the items you put into it.
        System.out.println("Sorted tree set: " + treeSet);
        //You don't need to maintain a sorted set when updating a set, you should use a hashset because it's faster to
        //insert and remove elements in a hash set. When you need a sorted set, you can create a tree set from the hash set. //pg 863

        System.out.println("first(): " + treeSet.first());
        System.out.println("last(): " + treeSet.last());
        System.out.println("headSet(\"New York\"): " + treeSet.headSet("New York"));
        System.out.println("tailSet)\"New York\"): " + treeSet.tailSet("New York"));

        //Use the methods in NavigableSet interface
        System.out.println("lower(\"P\"): " + treeSet.lower("P"));
        System.out.println("higher(\"P\"): " + treeSet.higher("P"));
        System.out.println("floor(\"P\"): " + treeSet.floor("P"));
        System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));
        System.out.println("pollFirst(): " + treeSet.pollFirst());
        System.out.println("pollLast(): " + treeSet.pollLast());
        System.out.println("New tree set: " + treeSet);

        Set<Integer> intSet = new HashSet<>(Arrays.asList(1, 4, 0, 9, 8, 7));
        System.out.println(intSet);
        TreeSet<Integer> treeIntSet = new TreeSet<>(intSet);
        System.out.println(treeIntSet);
    }
}
