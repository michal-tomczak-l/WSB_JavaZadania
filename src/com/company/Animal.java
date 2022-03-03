package com.company;

public class Animal {
    private static final Double DEFAULT_SHEEPDOG_WEIGHT = 2.0;
    private static final Double DEFAULT_YORK_WEIGHT = 1.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.5;
    final String species;
    private Double weight;
    String name;

    public Animal(String species, String name) {
        this.name = name;
        this.species = species;
        if (species.equals("sheep-dog")) {
            this.weight = DEFAULT_SHEEPDOG_WEIGHT;
        } else if (species.equals("york")) {
            this.weight = DEFAULT_YORK_WEIGHT;
        } else {
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        }

    }

    public void feed() {
        if (this.weight > 0 && this.weight < 3) {
            this.weight += 1.5;
            System.out.println("Dziękuje było smaczne - " + name);
        } else if (this.weight >= 3) {
            System.out.println("Już więcej nie mogę! Chodźmy na spacer! - " + name);
        } else if (this.weight <= 0) {
            System.out.println(name + " nie żyje :(... - ");
        }
    }

    public void takeForAWalk() {
            if (this.weight > 0) {
                this.weight -= 1.5;
                System.out.println("Pobiegałem i zgubiłem trochę wagi! - " + name);
            } else {
                System.out.println("Zabiegałeś " + name + "a na śmierć!!! "   );
            }
        }

    }
