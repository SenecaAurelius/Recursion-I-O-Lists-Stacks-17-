package com.example.javafx_ui_controls_and_multimedia.ch17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream {
    public static void main(String[] args) throws IOException {
        try (//create an output stream for file object.dat
             ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));
                ) {
            //write a string, double value, and object to the file
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeObject(new java.util.Date());
        }
    }
}
