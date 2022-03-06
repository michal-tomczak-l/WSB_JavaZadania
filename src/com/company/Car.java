package com.company;

public class Car {
    final String model;
    public String producer;
    public Integer year;
    public Double value;
    public Car(String model, String producer, Integer year, Double value) {
        this.model = model;
        this.producer = producer;
        this.year = year;
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
                ", year='" + year + '\'' +
                ", value=" + value +
                '}';
    }
}
