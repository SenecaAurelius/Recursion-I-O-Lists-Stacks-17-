package com.example.javafx_ui_controls_and_multimedia.ch17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        try ( //Create an input stream for file object.dat
              ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));
        ) {
            String name = input.readUTF();
            double score = input.readDouble();
            java.util.Date date = (java.util.Date) (input.readObject());
            System.out.println(name + " " + score + " " + date);
        }
    }
}
