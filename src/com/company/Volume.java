package com.company;

public class Volume extends Dimensions {
    private double depth;

    public Volume(double length, double height, double depth) {
        super(length, height);
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    public double getVolume() {
        return getArea(getLength(), getHeight()) * depth;
    }
}
