package com.example.javafx_ui_controls_and_multimedia.ch17;

import java.io.*;

public class TestObjectStreamForArray {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] strings = {"John", "Susan", "Kim"};

        try ( //Create an output stream for file array.dat
              ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("array.dat", true));
                ) {
            output.writeObject(numbers);
            output.writeObject(strings);
        }

        try ( //Create an input stream for file array.dat
              ObjectInputStream input = new ObjectInputStream(new FileInputStream("array.dat"));
                ) {
            int[] newNumbers = (int[])(input.readObject());
            String[] newStrings = (String[])(input.readObject());

            //Display Arrays
            for (int i = 0; i < newNumbers.length; i++){
                System.out.println(newNumbers[i] + ", ");
            }
            for(int i = 0; i < newStrings.length; i++){
                System.out.println(newStrings[i] + ", ");
            }
        }


    }
}
