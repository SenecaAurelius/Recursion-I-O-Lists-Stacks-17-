package com.example.javafx_ui_controls_and_multimedia.ch22Algorithms;

import java.util.Scanner;

public class ImprovedFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an index for the Fibonacci number : ");

        int index = input.nextInt();

        //find and display fibonacci number
        System.out.println("Fibonacci number at index " + index + " is " + fib(index));
    }

    public static long fib(long n){
        long f0 = 0; //for fib(0);
        long f1 = 1; //for fib(1);
        long f2 = 1;

        if(n == 0){
            return f0;
        } else if(n == 1){
            return f1;
        } else if(n == 2){
            return f2;
        }

        for(int i = 3; i <= n; i++){
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
        }

        return f2;
    }
}
