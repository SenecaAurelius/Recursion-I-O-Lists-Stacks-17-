package com.example.javafx_ui_controls_and_multimedia.ch22Algorithms;

import java.util.Scanner;

import static com.example.javafx_ui_controls_and_multimedia.ch22Algorithms.GCD.gcd;

public class GCDEuclid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first integer : ");
        int m = input.nextInt();
        System.out.println("Please enter the second integer : ");
        int n = input.nextInt();

        System.out.println("The GCD of " + m + " and " + n + " is " + GCDEuclid(m, n) + ".");
    }

    public static int GCDEuclid(int m, int n){
        if (m % n == 0) return n;
        else return gcd(n, m % n);
    }
}
