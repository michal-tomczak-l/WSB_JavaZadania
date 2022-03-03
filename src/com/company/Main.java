package com.company;

public class Main {

    public static void main(String[] args) {

        Animal york = new Animal("york", "Cezar") ;
        Animal sheepDog = new Animal ("sheep-dog", "Azor");
        york.feed();
        york.feed();
        york.feed();


        sheepDog.takeForAWalk();
        sheepDog.takeForAWalk();
        sheepDog.takeForAWalk();

        sheepDog.feed();
    }
}
