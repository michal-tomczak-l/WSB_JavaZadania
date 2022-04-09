package com.company.devices;


public class Diesel extends Car {

        public Diesel(String model, String producer, Integer yearOfProduction, Double value) {
            super(model, producer, yearOfProduction, value);
        }

        @Override
        public void refuel()  {
            System.out.println("Refueling...");

            System.out.println("Refueling...");

            System.out.println("Refueling...");

            System.out.println("Refueling complete! ");

        }
    }
