package com.example.javafx_ui_controls_and_multimedia.ch21;

import java.util.*;

public class CountOccurenceOfWords {
    public static void main(String[] args){
        String text = "Good morning. a s d a s d a s d Have a good class. " + "Have a good visit. Have fun!";

        //create a TreeMap to hold words as key and count as value
        Map<String, Integer> map = new TreeMap<>();

        String[] words = text.split("[\\s+\\p{P}]"); //\p{P} is punctuation
        for(int i = 0; i < words.length; i++){
            String key = words[i].toLowerCase();

            if(key.length() > 0) {
                if(!map.containsKey(key)) {
                    map.put(key, 1);
                }
                else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }

        map.forEach((k, v) -> System.out.println(k + "\t" + v));
//        for(String key : map) {
//            System.out.println(key + "\t" + map.getValue(key));
//        }

        List list = Collections.unmodifiableList(Arrays.asList("Chicago", "Dallas"));
        System.out.println(list);
//        list.remove("Dallas");
//        System.out.println(list);
    }
}
