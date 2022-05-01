package com.company.devices;

import com.company.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Phone extends Device {
    private static final String DEFAULT_APP_NAME = "Application_for_mobile";
    private static final String DEFAULT_SERVER_ADDRESS = "app.google.com";
    private static final String DEFAULT_VERSION = "3.0";
    private static final String DEFAULT_PROTOCOL = "https";
    public OperatingSystem operatingSystem;
    public Set<Application> applications = new HashSet<>();
    private Human owner;
    double AppValue = 0.0;

    public enum OperatingSystem {
        ANDROID, WINDOWS_MOBILE, IOS
    }


    public Phone(String model, String producer, Integer yearOfProduction, Human owner) {
        super(model, producer, yearOfProduction);
        this.owner = owner;
    }

    @Override
    public void TurnOn() {
        isTurnedOn = true;
    }

    public void installAnnApp(String application) {
        this.installAnnApp(application, DEFAULT_VERSION);
    }

    public void installAnnApp(String application, String version) {
        this.installAnnApp(DEFAULT_APP_NAME, DEFAULT_VERSION, DEFAULT_SERVER_ADDRESS);
    }

    public void installAnnApp(String application, String version, String address) {
        try {
            URL url = new URL(DEFAULT_PROTOCOL, DEFAULT_SERVER_ADDRESS, DEFAULT_APP_NAME + "//" + DEFAULT_VERSION);
            this.installAnnApp(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAnnApp(URL url) {
        System.out.println("Checking adress,and downloading file... " + url.getFile() + " Correct address! " + url.getHost());
        System.out.println("Installing -  " + url.getFile());
    }

    public void installBoughtApp(Application app) throws Exception {
        if (this.owner.getCash() < app.appPrice) {
            throw new Exception("Not enough money!");

        } else {
            this.applications.add(app);
            this.owner.setCash(this.owner.getCash() - app.appPrice);
        }
    }

    public boolean checkInstalledApp(Application app) {
        return this.applications.contains(app);
    }

    public boolean checkInstalledApp(String app) {
        for (Application application : this.applications) {
            if (application.name.equals(app)) {
                return true;
            }
        }
        return false;
    }
    public void showFreeApps() {
        for (Application application : this.applications) {
            if (application.appPrice == 0.0) {
                System.out.println(application.name);
            }
        }
    }

    public void valueOfInstalledApps() {
        for (Application application : this.applications) {
            if (application.appPrice > 0.0) {
                AppValue+= application.appPrice;
            }
        }
    }

    public void alphabetOrderApps() {
        for (Application application : applications) {

        }
    }


    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", isTurnedOn=" + isTurnedOn +
                '}';
    }
}
