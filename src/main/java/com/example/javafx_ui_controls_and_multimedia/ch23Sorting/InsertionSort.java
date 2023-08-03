package com.example.javafx_ui_controls_and_multimedia.ch23Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
//        for (int i = 1; i < list.length; i++){
//            insert list[i] into a sorted sublist list [0..i-1] so that
//                    list[0..i] is sorted
//        }
        int[] list = {1, 9, 4, 6, 5 ,-4};
        InsertionSort.insertionSort(list);

        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + ", ");
        }
        System.out.println();

        System.out.println(Arrays.toString(list));

    }

    public static void insertionSort(int[] list){


        for(int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k;
            for(k = i - 1; k >= 0 && list[k] > currentElement; k--){
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }


}
