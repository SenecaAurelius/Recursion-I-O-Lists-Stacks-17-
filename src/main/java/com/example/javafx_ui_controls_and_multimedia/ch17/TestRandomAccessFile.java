package com.example.javafx_ui_controls_and_multimedia.ch17;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
    public static void main(String[] args) throws IOException {
        try (//Create a random access file
             RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw");
                ) {
            //clear the file to destroy the old contents if exists
            inout.setLength(0);

            //write new integers to the file
            for (int i = 0; i < 200; i++){
                inout.writeInt(i);
            }

            //display the current length of the file
            System.out.println("Current file length is " + inout.length());

            //Retrieve the first number
            inout.seek(0); // move the file pointer to the beginning
            System.out.println("The first number is " + inout.readInt());

            //Retrieve the second number
            inout.seek(1 * 4); //????????
            System.out.println("The second number is " + inout.readInt());

            inout.seek(9 * 4); //move the pointer to the tenth number
            System.out.println("The 10th number is : " + inout.readInt());

            //modify the 11th number
            inout.writeInt(555);

            //Append a new number
            inout.seek(inout.length()); //move the file pointer to the end
            inout.writeInt(999);

            //Display the new length
            System.out.println("The new length is " + inout.length());

            //retrieve the new 11th number
            inout.seek(10 * 4); //move pointer to the 11th num
            System.out.println("The 11th number is " + inout.readInt());
        }
    }
}
