package com.company;


import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Device;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Human {
    private static final int DEFAULT_NUMBER_OF_CARS = 3;
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car[] garage;
    private LocalDateTime lastDate;
    private Double salary;
    private Double prevSalary;
    private Double cash;
    private Device device;
    public Device getDevice() {
        return device;
    }
    public void setDevice(Device device) {
        this.device = device;
 }
    public Double getCash() {
        return cash;
 }
    public void setCash(double cash) {
        this.cash = cash;
 }
    Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[DEFAULT_NUMBER_OF_CARS];

    }

    public Double getSalary() {
        if (lastDate != null) {
            long diff = ChronoUnit.SECONDS.between(lastDate, LocalDateTime.now());
            System.out.println("Dane o twojej wypłacie zostały pobrane: " + diff + " sekund temu");
            System.out.println("Twoja ostatnia wypłata przy sprawdzeniu wynosiła " + prevSalary);
            System.out.println("Twoja przyszła wypłata to: " + salary);
        }
        lastDate = LocalDateTime.now();
        prevSalary = salary;
        return salary;

    }

    public void setSalary(Double salary) {
        if (salary >= 0) {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego, proszę czekać...");
            System.out.println("Twój aneks do umowy jest gotowy u Pani Hani z działu kadr");
            System.out.println("Zmiany w twojej umowie zostały wysłane do ZUS i US");
            this.salary = salary;
            System.out.println("Twoja przyszła wypłata będzie wynosić: " + salary);
        } else {
            System.out.println("Saldo nie może być ujemne!");
        }

    }

    public Car getCar(Integer parkingSpot) {
        return garage[parkingSpot];
    }

    public void setCar(Car car, Integer parkingSpot) {
       this.garage[parkingSpot] = car;

        }

    public Double vehicleValue() {
        Double value = 0.0;
        for (Car car : garage) {
            if (car != null && car.value != null) {
                value += car.value;
            }
        }
        return value;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName=" + firstName +
                "lastName=" + lastName +
                "pet=" + pet +
                ", cars=" + garage +
                ", lastChecked=" + lastDate +
                ", previousSalaryValue=" + prevSalary +
                ", salary=" + salary +
                ", device=" + device +
                ", cash=" + cash +
                '}';
    }


}
