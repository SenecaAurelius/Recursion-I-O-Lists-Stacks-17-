package com.example.javafx_ui_controls_and_multimedia.ch18;

import java.util.Scanner;

public class ComputeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a non-negative number : ");
        int n = input.nextInt();

        //display factorial
        System.out.println("The Factorial of " + n + " is " + factorial(n));
    }

    public static long factorial(int n){
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
