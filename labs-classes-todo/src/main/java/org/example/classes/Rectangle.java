package org.example.classes;

public class Rectangle {

    private float length;

    private float width;

    public Rectangle (float length, float width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return (length * width);
    }

    public double getDiagonal() {
        return Math.sqrt((width * width) + (length * length));
    }

    public float getLength() {
        return length;
    }

    public double getPerimeter() {
        return ((length + width) * 2);
    }

    public float getWidth() {
        return width;
    }

}
