package com.example.javafx_ui_controls_and_multimedia.ch20;

import javafx.scene.paint.Color;

public abstract class GeometricObject {
    private Color color;
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(Color color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = new Color(Math.random(), Math.random(), Math.random(), 0.5);
        this.filled = filled;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled : " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
