package com.company.creatures;

import com.company.Human;
import com.company.Sellable;

public abstract class Animal implements Sellable, Feedable {
    private static final Double DEFAULT_DOG_WEIGHT = 2.0;
    private static final Double DEFAULT_CAT_WEIGHT = 1.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.5;
    final String species;
    private Double weight;
    private Boolean isAlive;
    private String name;


    public Animal(String species, String name) {
        this.name = name;
        this.species = species;
        this.isAlive = true;
        if (species.equals("dog")) {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals("cat")) {
            this.weight = DEFAULT_CAT_WEIGHT;
        } else {
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        }

    }

    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public Boolean getAlive() {
        return isAlive;
    }
    public void setAlive(Boolean alive) {
        isAlive = alive;
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

    public void feed(Double foodWeight) {
        if(this.weight > 0) {
            weight += foodWeight;
            System.out.println("Getting fat :)) ");
        }
        else
            System.out.println("YOU CANT FEED DEAD ANIMAL......");
    }

    public void takeForAWalk() {
            if (this.weight > 0) {
                this.weight -= 1.5;
                System.out.println("Pobiegałem i zgubiłem trochę wagi! - " + name);
            } else {
                System.out.println("Zabiegałeś " + name + "a na śmierć!!! "   );
            }
        }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", name=" + name +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.pet != this) throw new Exception("Animal is out of seller stock...");
        if (buyer.getCash() < price) throw new Exception("Animal is too expensive...");
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        seller.pet=null;
        buyer.pet = this;
        System.out.println("Successful transaction! " + buyer.firstName.toString() + " bought " + this.name.toString() + " from " + seller.firstName.toString() + " for " + price.toString());

    }
    }
