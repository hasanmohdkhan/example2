package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Plusar pulsar = new Plusar();
        pulsar.setColor("RED");
        pulsar.setMaxSpeed(180);
        pulsar.getInfo();
        pulsar.startDemo();


        Person person = new Person("Hasan", pulsar);

        System.out.println("Person name: "+ person.getName());
        System.out.println("Person bike: "+ person.getBike().getInfo());

        Plusar pulsar2 = new Plusar();
        pulsar2.setColor("Black");
        pulsar2.setMaxSpeed(280);
        pulsar2.getInfo();
        pulsar2.startDemo();

        Person person2 = new Person("Sam", pulsar2);
        System.out.println("\nPerson name: "+ person2.getName());
        System.out.println("Person bike: "+ person2.getBike().getInfo());


    }
}

