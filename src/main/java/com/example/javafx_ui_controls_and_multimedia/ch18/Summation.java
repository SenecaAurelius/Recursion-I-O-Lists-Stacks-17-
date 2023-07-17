package com.example.javafx_ui_controls_and_multimedia.ch18;

public class Summation {
    public static void main(String[] args) {
        addAll(10);
        addAll(1);
        addAll(3);
        addAll(4);
        addAll(5);

    }

    public static void addAll(int n){
        int sum = 0;
        for(int i = 0; i < n + 1; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
