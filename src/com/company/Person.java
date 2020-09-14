package com.company;

public class Person {
    private String name;
    private Bike bike;

    public Person(String name, Bike bike) {
        this.name = name;
        this.bike = bike;
    }

    public String getName() {
        return name;
    }

  /*  public void setName(String name) {
        this.name = name;
    }*/

    public Bike getBike() {
        return bike;
    }

    /*public void setBike(Bike bike) {
        this.bike = bike;
    }*/
}
