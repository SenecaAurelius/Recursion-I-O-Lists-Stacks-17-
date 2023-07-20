package com.example.javafx_ui_controls_and_multimedia.ch21;

import com.example.javafx_ui_controls_and_multimedia.ch20.Circle;
import com.example.javafx_ui_controls_and_multimedia.ch20.GeometricObject;
import com.example.javafx_ui_controls_and_multimedia.ch20.GeometricObjectComparator;
import com.example.javafx_ui_controls_and_multimedia.ch20.Rectangle;

import java.util.*;
public class TestTreeSetWithComparator {
    public static void main(String[] args){
        //create a tree set for geometric objects using a comparator
        Set<GeometricObject> set = new TreeSet<>(new GeometricObjectComparator());
        set.add(new Rectangle(4, 5));
        set.add(new Circle(40));
        set.add(new Circle(40));
        set.add(new Rectangle(4, 1));
        set.add(new Circle(100));
        set.add(new Rectangle(10, 10));

        //display all objects in the tree set
        System.out.println("A sorted set of geometric objects");
        for (GeometricObject element : set) {
            System.out.println("area = " + element.getArea());
        }
        System.out.println();
        set.forEach(e -> System.out.println(e.getPerimeter()));
    }
}
