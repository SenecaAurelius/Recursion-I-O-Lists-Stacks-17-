package com.example.javafx_ui_controls_and_multimedia.ch22Algorithms;

public class ShowOutput2 {
    public static void main(String[] args) {
        int count = 1;
        int iteration = 0;
        while(count < 30){
            count = count * 2;
            System.out.println("Here is the count : " + count);
            iteration += 1;
            System.out.println(iteration);
        }
    }
}
