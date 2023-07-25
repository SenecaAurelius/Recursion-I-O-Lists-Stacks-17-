package com.example.javafx_ui_controls_and_multimedia.ch22Algorithms;

import java.util.HashMap;
import java.util.Map;

public class CaesarCipher {
    public static void main(String[] args) {
        Map<String, Integer> alpha = new HashMap<>();
        int count = 0;
        for (char ch = 'A'; ch <= 'Z'; ++ch) {

            alpha.put(String.valueOf(ch), (Integer)(count));
            count++;
        }

        Map<Integer, String> map = new HashMap<>();
        int counter = 0;
        for(char ch = 'A'; ch <= 'Z'; ++ch){
            map.put(counter, String.valueOf(ch));
            counter++;
        }
        System.out.println("Hello " + map);
//        for(char ch = 'a'; ch <= 'z'; ++ch){
//            alpha.put(String.valueOf(ch), (Integer) (count));
//        }
        //alpha.forEach((k, v) -> (v = v + 1));
        System.out.println(alpha);

    }
}
