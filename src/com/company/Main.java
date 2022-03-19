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

        Human jack = new Human("Jack","Sparrow");

Car audi = new LPG("a8", "Audi", 2020);
Car tesla = new ElectricCar("S","Tesla",2019);

Phone xiaomi = new Phone("Redmi","Xiaomi",2015);
xiaomi.operatingSystem = Phone.OperatingSystem.WINDOWS_MOBILE;
        System.out.println(xiaomi.operatingSystem);
tesla.refuel();
audi.refuel();

Animal dog = new Animal("dog", "Alex") {


    public void feed(Double foodWeight) {

    }
};
        System.out.println(dog.getWeight());

        Human me = new Human("Jack","Sparrow");
        dog.getFoodType(0.5, FoodType.CROPS);
        dog.getFoodType(0.5, FoodType.ALL);
        System.out.println(dog.getWeight());

        System.out.println(Country.POLAND.getGDP());
        System.out.println(Country.POLAND.language);
        System.out.println(Country.POLAND.code);

        Country[] countries = new Country[3];
        countries[0] = Country.POLAND;
        countries[1] = Country.FRANCE;
        countries[2] = Country.USA;

        Map<String, Country> capitals = new HashMap<>();
        capitals.put("Warsaw", Country.POLAND);
        capitals.put("Paris",Country.FRANCE);
        capitals.put("Washington",Country.USA);

        TreeMap<String, Country> sortedCities = new TreeMap<>(capitals);
        System.out.println(sortedCities);

        Map<Country, Double> country = new HashMap<>();
        country.put(Country.POLAND, 312696.0);
        country.put(Country.USA, 9525067.0);
        country.put(Country.FRANCE, 551500.0);
        System.out.println(country.get(Country.USA));

        Country smallestCountry = Country.POLAND;
        Country biggestCountry = Country.USA;

        Map<FoodType, List<Animal>> animalsByFood = new HashMap<>();

        List<Animal> omnivorous = new LinkedList<>();
        omnivorous.add(dog);
        omnivorous.add(new Animal("cat", "Mruczek") {
                               @Override
                               public void feed(Double foodWeight) {

                               }
                       });
        animalsByFood.put(FoodType.ALL, omnivorous);

        List<Animal> carnivorous = new LinkedList<>();
        carnivorous.add(new Animal("cow", "Barbra") {
                @Override
                public void feed(Double foodWeight) {

                }
        });

        animalsByFood.put(FoodType.MEET, carnivorous);
        animalsByFood.put(FoodType.CROPS, new LinkedList<Animal>());
        animalsByFood.get(FoodType.CROPS).add(new Animal("Elephant", "Trąbalski") {
                @Override
                public void feed(Double foodWeight) {

                }
        });

        Map<String, Object> map = new HashMap<>();




        System.out.println(capitals.get("Warsaw"));
xiaomi.installAnnApp("app");
    }

}
