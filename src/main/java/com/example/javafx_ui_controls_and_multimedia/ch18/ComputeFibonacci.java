package com.example.javafx_ui_controls_and_multimedia.ch18;

import java.util.Scanner;

public class ComputeFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an index for a Fibonacci number : ");
        int index = input.nextInt();

        //find and display the Fibonacci number
        System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
    }

    public static long fib(long index){
        if (index == 0){
            return 0;
        } else if (index == 1){
            return 1;
        } else //Reduction and recursive calls
        {
            return fib(index - 1) + fib(index - 2);
        }
    }
}
