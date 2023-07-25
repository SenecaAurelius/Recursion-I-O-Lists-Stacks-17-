package com.example.javafx_ui_controls_and_multimedia.ch22Algorithms;

import java.util.Scanner;

public class GCD22_3 {

    public static int gcd22(int m, int n){
        int gcd = 1;

        if (m % n == 0) return n;

        for(int k = n / 2; k >= 1; k--){
            if(m % k == 0 && n % k == 0){
                gcd = k;
                break;
            }
        }

        return gcd;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first integer : ");
        int n = input.nextInt();
        System.out.println("Please enter the second integer : ");
        int m = input.nextInt();

        System.out.println("The GCD for " + n + " and " + m + " is " + gcd22(n, m) + ".");

    }
}
