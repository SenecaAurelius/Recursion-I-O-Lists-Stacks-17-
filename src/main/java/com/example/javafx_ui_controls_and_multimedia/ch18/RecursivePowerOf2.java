package com.example.javafx_ui_controls_and_multimedia.ch18;

public class RecursivePowerOf2 {
    public static void main(String[] args) {
        printPowerOfTwo(3); // 8
        printPowerOfTwo(4); //16
        printPowerOfTwo(5); //32
    }
    public static void printPowerOfTwo(int n){
        int power = 2;
        for(int i = 0; i < n - 1; i++){
            power *= 2;
        }
        System.out.println(power);
    }
}
