package com.company;

import static java.lang.Thread.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        Human me = new Human("Michal", "Tomczak");
//        me.pet = new Animal("dog","Azor" );
//        me.pet.feed();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.feed();

          Car audi = new Car("a3", "audi",2006, 1999.99);
          Car audi2 = new Car("a3", "audi",2006, 1999.99);

          //        me.setSalary(1500.50);
//        me.getSalary();
//        sleep(5000);
//        me.getSalary();
//        me.setSalary(1700.00);
//        me.setCar(audi);
//        me.setSalary(1000.00);
//        me.setCar(audi);
//        me.setSalary(200.00);

//        me.setCar(audi);

        Human she = new Human("Ania","Bania");
        Animal dog = new Animal("cat","Jurek");

        System.out.println(audi == audi2);
        System.out.println(audi.toString());
        System.out.println(audi.toString().equals(audi2.toString()));
        System.out.println(she.toString());
        System.out.println(dog.toString());
    }

}
