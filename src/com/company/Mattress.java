package com.company;

public class Mattress {
    private Dimensions dimensions;
    private double height;
    private String material;
    private String innerMaterial;

    public Mattress(Dimensions dimensions, double height, String material, String innerMaterial) {
        this.dimensions = dimensions;
        this.height = height;
        this.material = material;
        this.innerMaterial = innerMaterial;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public String getInnerMaterial() {
        return innerMaterial;
    }
}
