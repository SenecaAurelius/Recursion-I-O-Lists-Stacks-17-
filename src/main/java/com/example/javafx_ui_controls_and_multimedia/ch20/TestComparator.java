package com.example.javafx_ui_controls_and_multimedia.ch20;


import com.example.javafx_ui_controls_and_multimedia.ch19.Max;

import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args) {
        GeometricObject g1 = new Rectangle(5, 5);
        GeometricObject g2 = new Circle(5);

        GeometricObject g = max(g1, g2, new GeometricObjectComparator());

        System.out.println("The area of the larger object is " + g.getArea());


        max(g1, g2, (o1, o2) -> o1.getArea() > o2.getArea() ?
                1 : o1.getArea() == o2.getArea() ? 0 : -1);


//        double max = Math.max(g1.getArea(), g2.getArea());
//
//        System.out.println("The area of the larger object is " + max);


    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2, Comparator<GeometricObject> c){
        if (c.compare(o1, o2) > 0){
            return o1;
        } else return o2;
    }
}
