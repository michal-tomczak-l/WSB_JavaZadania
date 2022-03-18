package com.company.devices;

public abstract class Car extends Device {
    private Double value;

    public static final Double MINIMAL_REFUEL = 5.0;
    public static final Double MAXIMUM_FUEL = 20.0;
    private Double currentFuel = 10.0;
    public Car(String model, String producer, Integer yearOfProduction) {
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


}
