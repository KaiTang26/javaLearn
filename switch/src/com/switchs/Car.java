package com.switchs;

public class Car {

    private int doors;

    private int wheets;

    private String model;

    private String engine;

    private String colour;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheets() {
        return wheets;
    }

    public void setWheets(int wheets) {
        this.wheets = wheets;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setModel(String model){


        this.model = model;
    }

    public String getModel(){

        return this.model;
    }
}
