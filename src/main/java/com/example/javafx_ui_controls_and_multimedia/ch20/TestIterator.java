package com.example.javafx_ui_controls_and_multimedia.ch20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.addAll(List.of("New York", "Atlanta", "Dallas", "Madison"));

        Iterator<String> iterator = collection.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next().toUpperCase() + " ");
//        }
        for(String element : collection) System.out.print(element.toUpperCase() + " ");
        System.out.println();
    }
}
