package com.example.javafx_ui_controls_and_multimedia.ch18;

public class test4 {
    public static void main(String[] args) {
        xMethod(5);
    }
    public static void xMethod(int n){
        if (n > 0) {
            xMethod(n - 1);
            System.out.print(n + " ");
        }
    }
}
