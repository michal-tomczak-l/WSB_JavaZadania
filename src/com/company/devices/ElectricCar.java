package com.company.devices;


import static java.lang.Thread.sleep;

public class ElectricCar extends Car {

        public ElectricCar(String model, String producer, Integer yearOfProduction) {
            super(model, producer, yearOfProduction);
        }

        @Override
        public void refuel()  {
            System.out.println("Charging...");

            System.out.println("Charging...");

            System.out.println("Charging...");

            System.out.println("Charging complete! ");

        }
    }
