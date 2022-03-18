package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.Human;
import com.company.creatures.FarmAnimal;

public class Main {

    public static void main(String[] args) throws Exception {

        FarmAnimal dog = new FarmAnimal("dog", "Jack");
        System.out.println(dog.getWeight().toString());
        dog.feed(5.0);
        System.out.println(dog.getWeight().toString());
        dog.beEaten();
        System.out.println(dog.toString());


    }

}
