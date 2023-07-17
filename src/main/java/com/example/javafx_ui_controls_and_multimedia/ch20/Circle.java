package com.example.javafx_ui_controls_and_multimedia.ch20;

import javafx.scene.paint.Color;

public class Circle extends GeometricObject{
    private double radius;
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, boolean filled){
        this.radius = radius;
        setFilled(filled);
    }

//    public void setColor(Color color) {
//        this.color = color;
//    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter(){
        return radius * 2;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void printCirlce() {
        System.out.println("The circle was created on " + getDateCreated() + " and the radius is " + radius);
    }
}
