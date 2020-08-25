package com.company;

public class Ceiling {
    private Dimensions dimensions;

    public Ceiling(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWallArea(Dimensions dimensions) {
        return dimensions.getArea(dimensions.getLength(), dimensions.getHeight());
    }
}
