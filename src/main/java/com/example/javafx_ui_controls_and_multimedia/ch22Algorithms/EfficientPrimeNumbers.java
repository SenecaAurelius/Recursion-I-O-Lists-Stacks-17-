package com.example.javafx_ui_controls_and_multimedia.ch22Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EfficientPrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find all prime numbers <= n, enter n : ");
        int n = input.nextInt();

        List<Integer> list = new ArrayList<>();

        final int NUMBER_PER_LINE = 10;
        int count = 0;
        int number = 2;
        int squareRoot = 1;

        System.out.println("The prime numbers are \n");

        while (number <= n){
            boolean isPrime = true;

            if(squareRoot * squareRoot < number) squareRoot++;

            //Testing if number is prime
            for (int k = 0; k < list.size() && list.get(k) < squareRoot; k++){
                if(number % list.get(k) == 0){
                    isPrime = false;
                    break;
                }
            }

            //print the prime number and increase the count
            if (isPrime) {
                count++;
                list.add(number);
                if (count % NUMBER_PER_LINE == 0){
                    System.out.println(number);
                } else {
                    System.out.println(number + " ");
                }

            }

            number++;
        }

        System.out.println("\n" + count + " prime(s) less than or equal to " + n);
    }
}
