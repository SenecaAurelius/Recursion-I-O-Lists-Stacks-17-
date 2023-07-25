package com.example.javafx_ui_controls_and_multimedia.ch22Algorithms;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find all prime numbers <= n, enter n : ");
        int n = input.nextInt();

        final int NUMBER_PER_LINE = 10;
        int count = 0;
        int number = 2; // a number to be tested for primeness

        System.out.println("The prime numbers are : ");

        //repeatedly find prime numbers
        while (number <= n) {
            boolean isPrime = true;
            int squareRoot = (int)(Math.sqrt(number));
            for(int divisor = 2; divisor <= squareRoot; divisor++){
                if(number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                count++;

                if(count % NUMBER_PER_LINE == 0){
                    System.out.printf("%7d\n", number);
                } else {
                    System.out.printf("%7d", number);
                }
            }
            number++;
        }

        System.out.println("\n" + count + " prime(s) less than or equal to " + n);
    }
}
