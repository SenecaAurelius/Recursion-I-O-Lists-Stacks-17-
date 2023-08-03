package com.example.javafx_ui_controls_and_multimedia.ch23Sorting;

import java.io.*;

public class CreateLargeFile {

    //PAGE 928 IN JAVA BOOK PHASE I


    public static void main(String[] args) throws Exception {
        DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("largedata.dat")));

        for(int i = 0; i < 2_000_000; i++){
            output.writeInt((int)(Math.random() * 1_000_000));
        }
        output.close();

        //display the first 100 numbers
        DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream("largedata.dat")));

        for(int i = 0; i < 100; i++){
            System.out.print(input.readInt() + " ");
        }
        input.close();
    }
}
