package com.example.javafx_ui_controls_and_multimedia.ch21.endOfChapterExercises;

import java.util.*;

public class PerformSetOperationsOnHashSets {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("Chemistry", "Mathematics", "Biology", "English"));
        Set<String> set2 = new HashSet<>(Arrays.asList("Biology", "English", "Geography", "Physics"));

        //only present in the first stack
        //(LinkedHashSet<String>)(set1.clone());
//        set1.removeAll((Collection<?>) ((HashSet<String>) set2).clone());
//        System.out.println(set1);


        //only present in the second stack
//        set2.removeAll((Collection<?>) ((HashSet<String>) set1).clone());
//        System.out.println(set2);

        //present in both stacks
        set1.retainAll(set2);
        System.out.println(set1); //use retainAll to keep common occurances in both sets
    }
}
