package com.example.javafx_ui_controls_and_multimedia.ch20;

import java.util.*;

public class TestArrayAndLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // 1 is autoboxed to new Integer(1);
        arrayList.addAll(List.of(2, 3, 1, 4, 0));
        //There is an Arrays.asList("red", "blue", "green")
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 60, 90);
        System.out.println();
        System.out.println(intList);
        System.out.println();
        arrayList.add(0, 10);
        arrayList.add(3, 30);
        System.out.println("A list of ints in the array list. ");
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
        linkedList.add(1, "red");
        linkedList.removeLast();
        linkedList.addFirst("green");

        System.out.println("Display the linked list forward: ");
        ListIterator<Object> listIterator = linkedList.listIterator(); // list iterator
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        System.out.println("Display the linked list backwards :");
        listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
    }
}
