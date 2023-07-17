package com.example.javafx_ui_controls_and_multimedia.ch18;

public class test3 {
    public static void main(String[] args) {
        xMethod(5);
    }
    public static void xMethod(int n){
        if (n > 0) {
            System.out.print(n + " ");
            xMethod(n - 1);
        }
    }
}
