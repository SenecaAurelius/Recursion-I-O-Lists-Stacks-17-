package com.example.javafx_ui_controls_and_multimedia.ch18;

public class test1 {
    public static void main(String[] args) {
        System.out.println("Sum is " + xMethod(5));
    }
    public static int xMethod(int n){
        if (n == 1) {
            return 1;
        } else {
            return n + xMethod(n-1);
        }
    }
}
