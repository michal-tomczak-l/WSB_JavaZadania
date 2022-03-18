package com.company.creatures;

public class FarmAnimal extends Animal implements Edbile {
    public FarmAnimal(String species, String name) {
        super(species, name);
    }

    @Override
    public void beEaten() {
        setAlive(false);
        setWeight(0.0);
    }
}
