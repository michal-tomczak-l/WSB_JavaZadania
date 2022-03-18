package com.company.devices;

public class Car extends Device {
    private Double value;

    public Car(String model, String producer, Integer yearOfProduction, Double value) {
        super(model,producer,yearOfProduction);
        this.value = value;
    }
    public Double getValue() {
        return value;
    }

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

}
