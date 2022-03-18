package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.Human;

public class Main {

    public static void main(String[] args) throws Exception {

        Phone xiaomi = new Phone("Redmi","Xiaomi",2022);
        System.out.println(xiaomi.toString());
        Car audi = new Car("a6","Audi",2006,3000.0);
        audi.TurnOn();
        System.out.println(audi);

        Human dealer = new Human("Mark","seller");
        Human client = new Human("Tom","buyer");
        dealer.setDevice(xiaomi);
        dealer.setCash(0);
        client.setCash(10);
        xiaomi.sell(dealer, client, 10.0);

    }

}
