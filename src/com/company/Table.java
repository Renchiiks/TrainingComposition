package com.company;

public class Table implements ITable {
    private String name;
    private String manufacturer;
    private Dimensions dimensions;
    private double height;

    public Table(String name, String manufacturer, Dimensions dimensions, double height) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getHeight() {
        return height;
    }
}
