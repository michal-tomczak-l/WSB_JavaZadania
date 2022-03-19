package com.company.devices;

import com.company.Human;
import com.company.Sellable;


public abstract class Device implements Sellable {
    protected final String model;
    protected final String producer;
    protected final Integer yearOfProduction;
    protected boolean isTurnedOn;
    public Double value;

    public Device(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;

    }
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.getDevice() != this) throw new Exception("Item is out of seller stock...");
        if (buyer.getCash() < price) throw new Exception("Item is too expensive...");
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        seller.setDevice(null);
        buyer.setDevice(this);
        System.out.println("Successful transaction! " + buyer.firstName + " bought " + this.producer + " from " + seller.firstName + " for " + price.toString());
    }
    public abstract void TurnOn();
}
