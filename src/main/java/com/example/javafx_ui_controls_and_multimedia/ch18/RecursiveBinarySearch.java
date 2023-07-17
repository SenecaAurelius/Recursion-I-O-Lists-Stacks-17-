package com.example.javafx_ui_controls_and_multimedia.ch18;

public class RecursiveBinarySearch {
    public static void main(String[] args) {

    }

    public static int recursiveBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        return recursiveBinarySearch(list, key, low, high);
    }

    public static int recursiveBinarySearch(int[] list, int key, int low, int high){
        if (low > high) //the list has been exhausted without a match
            return -low - 1;

        int mid = (low + high) / 2;

        if (key < list[mid])
            return recursiveBinarySearch(list, key, low, mid - 1);
        else if (key == list[mid])
            return mid;
        else
            return recursiveBinarySearch(list, key, mid + 1, high);
    }
}
