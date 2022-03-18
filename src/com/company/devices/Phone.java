package com.company.devices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device {
    private static final String DEFAULT_APP_NAME="Application_for_mobile";
    private static final String DEFAULT_SERVER_ADDRESS ="app.google.com";
    private static final String DEFAULT_VERSION = "3.0";
    private static final String DEFAULT_PROTOCOL = "https";


    public Phone(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
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
