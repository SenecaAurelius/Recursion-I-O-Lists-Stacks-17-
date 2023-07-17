package com.example.javafx_ui_controls_and_multimedia.ch18;

public class test2 {
    public static void main(String[] args) {
        xMethod(1234567);
    }
    public static void xMethod(int n){
        if (n > 0){
            System.out.println(n % 10);
            xMethod(n / 10);
        }
    }
}
