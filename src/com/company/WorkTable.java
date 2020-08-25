package com.company;

public class WorkTable  extends Table{
    private int drawers;
    private int shelves;
    private boolean isSafe;
    private boolean isPlaceForKeyboard;

    public WorkTable(String name, String manufacturer, Dimensions dimensions, double height, int drawers, int shelves, boolean isSafe, boolean isPlaceForKeyboard) {
        super(name, manufacturer, dimensions, 65);
        this.drawers = drawers;
        this.shelves = shelves;
        this.isSafe = isSafe;
        this.isPlaceForKeyboard = isPlaceForKeyboard;
    }

    public int getDrawers() {
        return drawers;
    }

    public int getShelves() {
        return shelves;
    }

    public boolean isSafe() {
        return isSafe;
    }

    public boolean isPlaceForKeyboard() {
        return isPlaceForKeyboard;
    }

    public void openDrawer(){
        System.out.println("Drawer is open");
    }
    public void openSafe(){
        System.out.println("Safe is open");
    }
}
