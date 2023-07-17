package com.example.javafx_ui_controls_and_multimedia.ch18;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of disks : ");
        int n = input.nextInt();

        //find the solution recursively
        System.out.println("The moves are : ");
        moveDisks(n, 'A', 'B', 'C');
    }

    //the method for finding the solution to move n disks from fromTower to toTower with an auxtower
    public static void moveDisks(int n, char fromTower, char toTower, char auxTower){
        if (n == 1) //stopping condition
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
        else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }
}
