package com.example.javafx_ui_controls_and_multimedia.ch19;

public class GenericSort {
    public static void main(String[] args) {
        Integer[] intArray = {new Integer(2), new Integer(4), new Integer(3)};

        Double[] doubleArray = {new Double(3.4), new Double(1.3), new Double(-22.1)};

        Character[] charArray = {new Character('a'), new Character('J'), new Character('r')};

        String[] strArray = {new String("Tom"), new String("Susan"), new String("Kim")};



        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(strArray);

        System.out.print("Sorted Integer Objects: ");
        printList(intArray);
        System.out.print("Sorted Double Objects: ");
        printList(doubleArray);
        System.out.print("Sorted Characters Objects: ");
        printList(charArray);
        System.out.print("Sorted Strings Objects: ");
        printList(strArray);
    }

    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currentMinIndex;

        for(int i = 0; i < list.length - 1; i++){
            //find the min in the list[i+1..list.length-2]
            currentMin = list[i];
            currentMinIndex = i;

            for(int j = i + 1; j < list.length; j++){
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            //swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void printList(Object[] list){
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");

        }
        System.out.println();
    }

}
