package com.company.devices;


public class LPG extends Car {

        public LPG(String model, String producer, Integer yearOfProduction) {
            super(model, producer, yearOfProduction);
        }

        @Override
        public void refuel()  {
            System.out.println("Refueling...");

            System.out.println("Refueling...");

            System.out.println("Refueling...");

            System.out.println("Refueling complete! ");

        }
    }
