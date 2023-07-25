package com.example.javafx_ui_controls_and_multimedia.ch22Algorithms;

import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find all prime numbers <= n, please enter n : ");
        int n = input.nextInt();

        boolean[] primes = new boolean[n + 1];

        //initialize primes[i] to true
        for (int i = 0; i < primes.length; i++){
            primes[i] = true;
        }

        for(int k = 2; k <= n / k; k++){
            if (primes[k]){
                for(int i = k; i <= n / k; i++){
                    primes[k * i] = false; //k * i is not prime
                }
            }
        }

        final int NUMBER_PER_LINE = 10;
        int count = 0;

        for(int i = 2; i < primes.length; i++){
            if (primes[i]) {
                count++;
                if(count % NUMBER_PER_LINE == 0 ){
                    System.out.printf("%7d\n", i);
                } else {
                    System.out.printf("%7d", i);
                }
            }
        }

        System.out.println("\n" + count + " prime(s) less than or equal to " + n);
    }
}
