package com.company;

import com.company.devices.Car;
import com.company.devices.ElectricCar;
import com.company.devices.LPG;
import com.company.devices.Phone;
import com.company.creatures.Animal;
import com.company.creatures.FoodType;

public class Main {

    public static void main(String[] args) throws Exception {

        Human jack = new Human("Jack","Sparrow");

Car audi = new LPG("a8", "Audi", 2020);
Car tesla = new ElectricCar("S","Tesla",2019);

Phone xiaomi = new Phone("Redmi","Xiaomi",2015);
xiaomi.operatingSystem = Phone.OperatingSystem.WINDOWS_MOBILE;
        System.out.println(xiaomi.operatingSystem);
tesla.refuel();
audi.refuel();

Animal dog = new Animal("dog", "Alex") {
    @Override
    public void feed(Double foodWeight) {

    }
};
        System.out.println(dog.getWeight());

        dog.getFoodType(0.5, FoodType.CROPS);
        dog.getFoodType(0.5, FoodType.ALL);
        System.out.println(dog.getWeight());


xiaomi.installAnnApp("app");
    }

}
