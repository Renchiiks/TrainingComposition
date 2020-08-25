package com.company;

public class DiningTable extends Table {
    private int numOfPersons;
    private boolean isFolding;

    public DiningTable(String name, String manufacturer, Dimensions dimensions, int numOfPersons, boolean isFolding) {
        super(name, manufacturer, dimensions, 75);
        this.numOfPersons = numOfPersons;
        this.isFolding = isFolding;
    }

    public int getNumOfPersons() {
        return numOfPersons;
    }

    public boolean isFolding() {
        return isFolding;
    }

    public void foldTable() {
        if (!isFolding) {
            System.out.println("It is not possible to fold this table");
        } else {
            System.out.println("Table is folded");
        }
    }
}
