package com.example.javafx_ui_controls_and_multimedia.ch23Sorting;

public class MergeSort {

    public static void mergeSort(int[] list){

        if(list.length > 1){
            //Merge sort the first half
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            //merge sort the second half
            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            //merge firstHalf with secondHalf into list
            merge(firstHalf, secondHalf, list);

        }
//        if(list.length > 1){
//            mergeSort(list[0] ... list.length / 2);
//            mergeSort(list[list.length / 2 + 1 ... list.length]);
//            merge list[0 ... list.length / 2] with
//                    list[list.length / 2 + 1 ... list.length];
//        }
    }

    public static void merge(int[] list1, int[] list2, int[] temp){
        int current1 = 0; //current index in list1
        int current2 = 0; //current index in list2
        int current3 = 0; //current index in temp

        while(current1 < list1.length && current2 < list2.length){
            if(list1[current1] < list2[current2]){
                temp[current3++] = list1[current1++];
            } else {
                temp[current3++] = list2[current2++];
            }
        }

        while(current1 < list1.length){
            temp[current3++] = list1[current1++];
        }
        while(current2 < list2.length){
            temp[current3++] = list2[current2++];
        }
    }

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + ", ");
        }
        System.out.println();
        mergeSort(list);
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + ", ");
        }
        System.out.println();

        int[] randomIntList = new int[15];
        for(int i = 0; i < 15; i++){
            randomIntList[i] = (int)(Math.random() * 100);
        }
        for(int i = 0; i < randomIntList.length; i++){
            System.out.print(randomIntList[i] + ", ");
        }
        System.out.println();
        mergeSort(randomIntList);
        for(int i = 0; i < randomIntList.length; i++){
            System.out.print(randomIntList[i] + ", ");
        }
        System.out.println();
    }
}





















