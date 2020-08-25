package com.company;

public class Dimensions {
    private double length;
    private double height;

    public Dimensions(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(double length, double height) {
        double result = length * height;
        return result;
    }
}
