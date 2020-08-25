package com.company;

public class Windows {
    private String manufacturer;
    private Dimensions dimensions;
    private String info;
    private boolean isClosed;

    public Windows(String manufacturer, Dimensions dimensions, String info) {
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
        this.info = info;
        this.isClosed = true;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getInfo() {
        return info;
    }

    public void windowState(boolean isClosed){
        if(isClosed){
            this.isClosed = true;
        }else {
            openWindow();
        }
    }

    private void openWindow() {
        this.isClosed = false;
        System.out.println("Widow is open");
    }
}
