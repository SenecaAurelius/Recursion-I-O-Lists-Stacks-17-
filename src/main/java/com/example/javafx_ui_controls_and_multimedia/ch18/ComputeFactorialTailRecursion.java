package com.example.javafx_ui_controls_and_multimedia.ch18;

public class ComputeFactorialTailRecursion {
    public static long factorial(int n) {
        return factorial(n, 1); //call auxiliary method
    }

    //auxiliary tail-recursive method for factorial
    private static long factorial(int n, int result){
        if (n == 0)
            return result;
        else
            return factorial(n - 1, n * result);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(6));
        System.out.println(factorial(7));
        System.out.println(factorial(8));
    }
}
