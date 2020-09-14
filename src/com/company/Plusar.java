package com.company;

class Plusar extends Bike {
    //Plusar  extends Bike and thus inherits all methods from Bike(except final and static)
    //Plusar  can also define all its specific functionality
    public void startDemo()
    {
        //creating object of engine (that has-a relationship)
        Engine engine = new Engine();
        engine.start();
    }
}



