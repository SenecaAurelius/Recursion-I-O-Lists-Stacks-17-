package com.example.javafx_ui_controls_and_multimedia.ch23Sorting;

public class HeapSort {

    public static void main(String[] args) {
        Integer[] list = {3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + ", ");
        }
        System.out.println();
        heapSort(list);

        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + ", ");
        }
        System.out.println();

        Integer[] list2 = new Integer[10];
        for(int i = 0; i < 10; i++){
            list2[i] = (Integer)(int)(Math.random() * 100);
        }
        for(int i = 0; i < list2.length; i++){
            System.out.print(list2[i] + ", ");
        }
        System.out.println();
        heapSort(list2);

        for(int i = 0; i < list2.length; i++){
            System.out.print(list2[i] + ", ");
        }
    }

    public static <E extends Comparable<E>> void heapSort(E[] list) {
        Heap<E> heap = new Heap<>();

        //add elements to the heap
        for(int i = 0; i < list.length; i++){
            heap.add(list[i]);
        }

        //remove elements from the heap
        for(int i = list.length - 1; i >= 0; i--){
            list[i] = heap.remove();
        }
    }


}
