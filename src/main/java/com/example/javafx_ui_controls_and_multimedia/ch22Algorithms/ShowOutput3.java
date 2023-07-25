package com.example.javafx_ui_controls_and_multimedia.ch22Algorithms;

public class ShowOutput3 {
    public static void main(String[] args){
        int count = 15;
        int iteration = 0;
        while (count < 30){
            count = count * 3;
            iteration += 1;
            System.out.println("Here is the count " + count);
            System.out.println(iteration);
        }
    }
}
