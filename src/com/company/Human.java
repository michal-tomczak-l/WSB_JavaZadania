package com.company;


import com.company.devices.Car;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet;
    private Car car;

    private LocalDateTime lastDate;
    private Double salary;
    private Double prevSalary;


    Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

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

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        if (salary > car.getValue()) {
            System.out.println("Lets get it for cash");
            this.car = car;
        } else if (salary > car.getValue() / 2) {
            System.out.println("Lets call to the bank, and get loan for the car");
            this.car = car;
        } else {
            System.out.println("You are poor...");

        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName=" + firstName +
                "lastName=" + lastName +
                "pet=" + pet +
                ", car=" + car +
                ", lastChecked=" + lastDate +
                ", previousSalaryValue=" + prevSalary +
                ", salary=" + salary +
                '}';
    }
}
