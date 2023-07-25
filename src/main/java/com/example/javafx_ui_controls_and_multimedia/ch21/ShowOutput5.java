package com.example.javafx_ui_controls_and_multimedia.ch21;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShowOutput5 {
    public static void main(String[] args){
        Map<String, String> map = new LinkedHashMap<>();
        map.put("123", "John Smith");
        map.put("111", "George Smith");
        map.put("123", "Steve Yao");
        map.put("222", "Steve Yao");
        System.out.println("(1) " + map);
        System.out.println("(2) " + new TreeMap<String, String>(map));
        map.forEach((k, v) -> {
            if (k.equals("123")){
                System.out.println(v);
            }
        });
        map.forEach((k, v) -> {
            if(v.equals("Steve Yao")){
                System.out.println(k);
            }
        });
        //map cannot take two of the same keys, but can have two of the same values. So we can have two Steve Yaos, since the names are values,
        //but cannot have the key 123 to be in the map twice, even if it has different name values.

    }
}
