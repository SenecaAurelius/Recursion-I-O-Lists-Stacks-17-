package com.example.javafx_ui_controls_and_multimedia.ch20;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");

        while(queue.size() > 0){
            System.out.print(queue.remove() + " ");
        }
    }
}
