package com.company;

import static java.lang.Thread.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        Human me = new Human("Michal", "Tomczak");
//        me.pet = new Animal("york","Azor" );
//        me.pet.feed();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.feed();
//        me.car = new Car("a3", "audi",2006);
        me.setSalary(1500.50);
        me.getSalary();
        sleep(5000);
        me.getSalary();
        me.setSalary(1700.00);
        me.getSalary();



    }
}
