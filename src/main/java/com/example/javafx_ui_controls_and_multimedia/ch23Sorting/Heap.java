package com.example.javafx_ui_controls_and_multimedia.ch23Sorting;

import java.util.ArrayList;

public class Heap<E extends Comparable<E>>{
    private ArrayList<E> list = new ArrayList<>();

    //create a default Heap
    public Heap() {

    }

    //create a heap from an array of objects
    public Heap(E[] objects){
        for(int i = 0; i < objects.length; i++){
            add(objects[i]);
        }
    }

    //add a new object into the heap
    public void add(E newObject) {
        list.add(newObject); //append to the heap
        int currentIndex = list.size() - 1; //the index of the last node

        while(currentIndex > 0){
            int parentIndex = (currentIndex - 1) / 2;
            //Swap if the current object is greater than its parent
            if(list.get(currentIndex).compareTo(list.get(parentIndex)) > 0) {
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                list.set(parentIndex, temp);
            }
            else {
                break;
            }
            currentIndex = parentIndex;
        }
    }

    public E remove() {
        if(list.size() == 0) {
            return null;
        }

        E removedObject = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);

        int currentIndex = 0;
        while(currentIndex < list.size()){
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;

            //find the max between two children
            if (leftChildIndex >= list.size()) {
                break; //the tree is a heap
            }
            int maxIndex = leftChildIndex;
            if(rightChildIndex < list.size()) {
                if(list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0) {
                    maxIndex = rightChildIndex;
                }
            }

            //swap if the current node is less than the max
            if(list.get(currentIndex).compareTo(list.get(maxIndex)) < 0){
                E temp = list.get(maxIndex);
                list.set(maxIndex, list.get(currentIndex));
                list.set(currentIndex, temp);
                currentIndex = maxIndex;
            }
            else {
                break;
            }
        }
        return removedObject;
    }


    //get the number of nodes in the tree
    public int getSize() {
        return list.size();
    }

}
