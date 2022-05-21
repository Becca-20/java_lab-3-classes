package org.example.classes;

public class Circle {

    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return (radius * 2) * Math.PI;
    }

    public double getRadius() {
        return radius;
    }
}
