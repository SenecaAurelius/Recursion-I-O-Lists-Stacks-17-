package com.example.javafx_ui_controls_and_multimedia.ch23Sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + ", ");
        }
        System.out.println();
        quickSort(list);
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + ", ");
        }
        System.out.println();

        int[] ranIntList = new int[12];
        for(int i = 0; i < 12; i++){
            ranIntList[i] = (int)(Math.random() * 100);
        }

        for(int i = 0; i < ranIntList.length; i++){
            System.out.print(ranIntList[i] + ", ");
        }
        System.out.println();
        quickSort(ranIntList);
        for(int i = 0; i < ranIntList.length; i++){
            System.out.print(ranIntList[i] + ", ");
        }
        System.out.println();
    }

    public static void quickSort(int[] list){
        quickSort(list, 0, list.length - 1);

//        if(list.length > 1){
//            select a pivot;
//            partition list into list1 and list2 such that all elements in list1 <= pivot and
//                    all elements in list2 > pivot;
//            quickSort(list1);
//            quickSort(list2);
//        }
    }

    public static void quickSort(int[] list, int first, int last){
        if(last > first){
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    public static int partition(int[] list, int first, int last){
        int pivot = list[first];
        int low = first + 1;
        int high = last;

        while(high > low){
            //search forward from left
            while(low <= high && list[low] <= pivot){
                low++;
            }
            //search backward from right
            while(low <= high && list[high] > pivot){
                high--;
            }
            //swap two elements in the list
            if(high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while(high > first && list[high] >= pivot){
            high--;
        }

        //swap pivot with list[high]
        if(pivot > list[high]){
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }
}
