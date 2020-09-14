package com.company;

public class Bike  {
    private String color;
    private int maxSpeed;
    private Engine engine;


    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getInfo(){
       return "Bike Color= "+color + " Max Speed= " + maxSpeed;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
