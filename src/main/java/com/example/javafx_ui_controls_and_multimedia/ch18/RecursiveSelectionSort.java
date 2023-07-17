package com.example.javafx_ui_controls_and_multimedia.ch18;

public class RecursiveSelectionSort {
    public static void main(String[] args) {
        double[] list = {1.0, 10.0, 7.0, 6.0};
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
        sort(list);
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }

    public static void sort(double[] list){
        sort(list, 0, list.length - 1); //sort the entire list
    }

    public static void sort(double[] list, int low, int high) {
        if (low < high) {
            int indexOfMin = low;
            double min = list[low];
            for (int i = low + 1; i <= high; i++){
                if(list[i] < min){
                    min = list[i];
                    indexOfMin = i;
                }
            }

            //swap the smallest in list[low .. high] with list[low]
            list[indexOfMin] = list[low];
            list[low] = min;

            //sort the remaining list[low+1 .. high]
            sort(list, low + 1, high);
        }
    }
}
