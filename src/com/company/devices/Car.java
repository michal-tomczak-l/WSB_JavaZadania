package com.company.devices;

import com.company.Human;
import com.company.Sellable;

import java.util.LinkedList;
import java.util.List;

public abstract class Car extends Device implements Sellable {
    public Double value;
    public List<Human> owners = new LinkedList<>();
    public static final Double MINIMAL_REFUEL = 5.0;
    public static final Double MAXIMUM_FUEL = 20.0;
    private Double currentFuel = 10.0;
    public Car(String model, String producer, Integer yearOfProduction, Double value) {
        super(model,producer,yearOfProduction);
        this.value = value;
    }
    public Double getValue() {
        return value;
    }
    public abstract void refuel();
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                ", value=" + value +
                ", isTurnedOn=" + isTurnedOn +
                '}';
    }
    @Override
    public void TurnOn() {
        isTurnedOn = true;
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.gotCar(this)) {
            throw new Exception("Seller doesn't own this car!");
        }
        if (!buyer.garageSpace()) {
            throw new Exception("Buyer has no space in his garage for this car!");
        }
        if (buyer.getCash() < price) {
            throw new Exception("You are poor! Get yourself a job (as JavaDev for example)");
        }
        buyer.boughtCar(this);
        owners.add(buyer);
        seller.soldCar(this);
        buyer.cash -= price;
        seller.cash += price;
        System.out.println("Transaction succesfully!");
    }
    public boolean previousOwner(Human human){
        return owners.contains(human);
    }

    public boolean carCredentials(Human buyer, Human seller){
        boolean newCredentials = false;
        for(int i = 0; i < owners.size()-1; i++){
            if(owners.get(i) == buyer && owners.get(i+1) == seller){
                newCredentials = true;
                break;
            }
        }
        return newCredentials;
    }

    public Integer numberOfSales(){
        if(owners != null){
            return owners.size() -1;
        } else {
            return 0;
        }
    }
}
