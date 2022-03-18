package com.company;

import com.company.devices.Car;
import com.company.devices.ElectricCar;
import com.company.devices.LPG;
import com.company.devices.Phone;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        Human jack = new Human("Jack","Sparrow");

Car audi = new LPG("a8", "Audi", 2020);
Car tesla = new ElectricCar("S","Tesla",2019);

Phone xiaomi = new Phone("Redmi","Xiaomi",2015);

tesla.refuel();
audi.refuel();

xiaomi.installAnnApp("app");
    }

}
