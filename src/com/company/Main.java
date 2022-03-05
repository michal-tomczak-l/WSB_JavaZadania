package com.company;

public class Main {

    public static void main(String[] args) {


        Human me = new Human("Michal", "Tomczak");
        me.pet = new Animal("york","Azor" );
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.car = new Car("a3", "audi",2006);



    }
}
