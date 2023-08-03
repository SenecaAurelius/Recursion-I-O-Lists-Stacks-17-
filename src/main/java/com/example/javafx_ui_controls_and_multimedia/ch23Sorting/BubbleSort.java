package com.example.javafx_ui_controls_and_multimedia.ch23Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

        int[] list2 = new int[100];
        for(int i = 0; i < 100; i++){
            list2[i] = (int)((Math.random() * 100));
        }
        for(int i = 0; i < list2.length; i++){
            System.out.print(list2[i] + ", ");
        }
        bubbleSort(list2);
        System.out.println("And the sorted second list : ");
        for(int i = 0; i < list2.length; i++){
            System.out.print(list2[i] + ", ");
        }
        System.out.println();

        bubbleSort(list);
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + ", ");
        }
    }

    public static void bubbleSort(int[] list){
        boolean needNextPass = true;
        for(int k = 1; k < list.length && needNextPass; k++){
            //Array might be sorted already
            needNextPass = false;
            for(int i = 0; i < list.length - k; i++){
                if (list[i] > list[i + 1]){
                    //swap list[i] with list[i + 1]
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; //next pass is still needed
                }
            }
        }






//        for(int k = 1; i < list.length; k++){
//            for(int i = 0; i < list.length - k; i++){
//                if(list[i] > list[i + 1]){
//                    swap list[i] with list[i+1];
//                }
//            }
//        }

        //improved
//        boolean needNextPass = true;
//
//        for(int k = 1; k < list.length && needNextPass; k++){
//            //Array may be sorted and next pass not needed
//            needNextPass = false;
//            for(int i = 0; i < list.length - k; i++){
//                if (list[i] > list[i + 1]){
//                    swap list[i] with list[i + 1];
//                    needNextPass = true; // next pass is still needed
//                }
//            }
//        }
    }
}
