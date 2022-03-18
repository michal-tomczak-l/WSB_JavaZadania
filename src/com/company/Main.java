package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Phone xiaomi = new Phone("Redmi","Xiaomi",2022);
        System.out.println(xiaomi.toString());
        Car audi = new Car("a6","Audi",2006,3000.0);
        audi.TurnOn();
        System.out.println(audi);
    }

}
