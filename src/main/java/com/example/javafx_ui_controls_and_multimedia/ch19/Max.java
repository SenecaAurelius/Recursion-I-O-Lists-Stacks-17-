package com.example.javafx_ui_controls_and_multimedia.ch19;

public class Max {

    public static void main(String[] args) {
        //Max.max("Welcome", 23);
    }
    //Return the max of two objects
    public static Comparable max(Comparable o1, Comparable o2){
        if (o1.compareTo(o2) > 0){
            return o1;
        }
        else return o2;
    }
}
