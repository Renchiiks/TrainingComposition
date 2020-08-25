package com.company;

public class Wall {
    private String name;
    private Dimensions dimensions;

    public Wall(String name, Dimensions dimensions) {
        this.name = name;
        this.dimensions = dimensions;
    }

    public String getName() {
        return name;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWallArea(Dimensions dimensions) {
        double result = dimensions.getArea(dimensions.getLength(), dimensions.getHeight());
        return result ;
    }
}
