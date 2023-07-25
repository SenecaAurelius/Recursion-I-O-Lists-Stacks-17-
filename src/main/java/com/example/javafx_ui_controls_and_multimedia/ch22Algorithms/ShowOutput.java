package com.example.javafx_ui_controls_and_multimedia.ch22Algorithms;

public class ShowOutput {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i < n; i++){
            System.out.print(i);
        }
        System.out.println();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(i);
            }
        }
        System.out.println();

        for(int k = 0; k < n; k++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(k);
                }
            }
        }
        System.out.println();

        for(int k = 0; k < 10; k++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(k);
                }
            }
        }
    }
}
