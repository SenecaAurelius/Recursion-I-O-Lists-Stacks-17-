package com.example.javafx_ui_controls_and_multimedia.ch19;

public class IntegerMatrix extends GenericMatrix<Integer> {
    @Override //add two integers
    protected Integer add(Integer o1, Integer o2){
        return o1 + o2;
    }

    @Override
    protected Integer multiply(Integer o1, Integer o2){
        return o1 * o2;
    }

    @Override
    protected Integer zero() {
        return 0;
    }

}
