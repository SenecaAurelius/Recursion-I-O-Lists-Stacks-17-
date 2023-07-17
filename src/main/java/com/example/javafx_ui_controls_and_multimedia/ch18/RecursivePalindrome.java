package com.example.javafx_ui_controls_and_multimedia.ch18;

public class RecursivePalindrome {
    public static void main(String[] args) {
        System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
        System.out.println("Is noon a palindrome? " + isPalindrome("noon"));
        System.out.println("Is a a palindrome? " + isPalindrome("a"));
        System.out.println("Is ab a palindrome? " + isPalindrome("ab"));
    }

    public static boolean isPalindrome(String s){
        return isPalindrome(s, 0, s.length() - 1);
    }

    public static boolean isPalindrome(String s, int low, int high){
        if (high <= low) //base case
            return true;
        else if (s.charAt(low) != s.charAt(high))
            return false;
        else
            return isPalindrome(s, low + 1, high - 1);
    }
}
