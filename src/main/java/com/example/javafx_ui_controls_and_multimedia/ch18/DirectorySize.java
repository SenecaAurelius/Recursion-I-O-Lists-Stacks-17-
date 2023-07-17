package com.example.javafx_ui_controls_and_multimedia.ch18;

import java.io.File;
import java.util.Scanner;

public class DirectorySize {
    public static void main(String[] args) {
        System.out.println("Please enter a directory or a file : ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

        //Display the size
        System.out.println(getSize(new File(directory)) + " bytes");
    }

    public static long getSize(File file){
        long size = 0; // store total size of all files
        if (file.isDirectory()) {
            File[] files = file.listFiles(); //all files and subdirectories
            for (int i = 0; file != null && i < files.length; i++){
                size += getSize(files[i]); // recursive call
            }
        }
        else // base case
            size += file.length();
        return size;
    }
}
