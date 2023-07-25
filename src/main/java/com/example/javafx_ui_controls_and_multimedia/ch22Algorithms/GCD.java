package com.example.javafx_ui_controls_and_multimedia.ch22Algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class GCD {
    public static void main(String[] args) {
        Integer[] intArr = {6, 10, 13, 70, 85, 90};
        Integer[] intArr2 = {20, 99, 39, 10, 15, 27};

        ArrayList<Integer> answers1 = new ArrayList<>();
        ArrayList<Integer> answers2 = new ArrayList<>();
        ArrayList<Integer> answers3 = new ArrayList<>();

        for(int i = 0; i < intArr.length; i++){
            System.out.println("The greatest common denominator between " + intArr[i] + " and " + intArr2[i] + " is " +
                    gcd(intArr[i], intArr2[i]));
            answers1.add(gcd(intArr[i], intArr2[i]));
        }

        for(int i = 0; i < intArr.length; i++){
            System.out.println("The improved greatest common denominator between " + intArr[i] + " and " + intArr2[i] + " is " +
                    improvedGCD(intArr[i], intArr2[i]));

            answers2.add(improvedGCD(intArr[i], intArr2[i]));
        }

        for(int i = 0; i < intArr.length; i++){
            System.out.println("The further improved greatest common denominator between " + intArr[i] + " and " + intArr2[i] + " is " +
                    furtherImprovedGCD(intArr[i], intArr2[i]));
            answers3.add(furtherImprovedGCD(intArr[i], intArr2[i]));
        }

        System.out.println(answers1);
        System.out.println(answers2);
        System.out.println(answers3);
    }

    public static int gcd(int m, int n){
        int gcd = 1;
        int iteration = 0;
        for(int k = 2; k <= m && k <= n; k++){
            if(m % k == 0 && n % k == 0){
                gcd = k;
            }
            iteration += 1;

        }
        System.out.println("The number of iterations : " + iteration);
        return gcd;
    }

    public static int improvedGCD(int m, int n){
        int gcd = 1;
        int iteration = 0;
        for(int k = n; k >= 1; k--){
            if(m % k == 0 && n % k == 0){
                gcd = k;
                break;
            }
            iteration += 1;
//            System.out.println(iteration);
        }
        System.out.println("The number of iterations : " + iteration);
        return gcd;

    }

    public static int furtherImprovedGCD(int m, int n){
        int gcd = 1;
        int iteration = 0;
        for(int k = m / 2; k >= 1; k--){
            if(m % k == 0 && n % k == 0){
                gcd = k;
                break;
            }
            iteration += 1;
//            System.out.println(iteration);
        }
        System.out.println("The number of iterations : " + iteration);
        return gcd;
    }
}
