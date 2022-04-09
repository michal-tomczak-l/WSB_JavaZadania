package com.company;

import com.company.devices.Car;
import com.company.devices.ElectricCar;
import com.company.devices.LPG;
import com.company.devices.Phone;
import com.company.creatures.Animal;
import com.company.creatures.FoodType;

import java.util.*;

public class Main {

        public static void main(String[] args) throws Exception {

                Human jack = new Human("Jack", "Sparrow",2);
                jack.setCash(1000.0);

                Car tesla = new Car("S", "Tesla", 2000, 500.0) {
                        @Override
                        public void refuel() {

                        }
                };
                jack.setCar(tesla,1);
                System.out.println(jack.vehicleValue());

                Human janusz = new Human("Janusz", "Biznesu",2);
                janusz.setCash(500.0);



                try {
                        tesla.sell(jack, janusz, 200.0);
                } catch (Exception e) {
                        System.out.println("Drogo, drogo, można taniej panie?");
                        e.printStackTrace();
                }
                System.out.println("Number of sales: " + tesla.numberOfSales());
                try {
                        tesla.sell(janusz, jack, 500.0);
                } catch (Exception e) {
                        System.out.println("Drogo, drogo, można taniej panie?");
                        e.printStackTrace();
                }
                System.out.println(tesla.owners.size());
                System.out.println("Number of sales: " + tesla.numberOfSales());

        }
}




