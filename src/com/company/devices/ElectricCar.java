package com.company.devices;


import static java.lang.Thread.sleep;

public class ElectricCar extends Car {

        public ElectricCar(String model, String producer, Integer yearOfProduction, Double value) {
            super(model, producer, yearOfProduction, value);
        }

        @Override
        public void refuel()  {
            System.out.println("Charging...");

            System.out.println("Charging...");

            System.out.println("Charging...");

            System.out.println("Charging complete! ");

        }
    }
