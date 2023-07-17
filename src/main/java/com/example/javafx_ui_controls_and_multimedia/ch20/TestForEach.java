package com.example.javafx_ui_controls_and_multimedia.ch20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestForEach {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.addAll(List.of("New York", "Atlanta", "Dallas", "Madison"));

        //lambda expression
        collection.forEach(e -> System.out.print(e.toUpperCase() + " "));

        //anonymous inner class
        collection.forEach(
                new java.util.function.Consumer<String>() {
                    public void accept(String e) {
                        System.out.print(e.toUpperCase() + " ");
                    }
                });
    }
}
