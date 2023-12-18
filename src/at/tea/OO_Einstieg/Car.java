package at.tea.OO_Einstieg;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private Engine engine;
    private final List<RearMirror> mirrors;
    private final List<Wheel> wheels;
    private int fuelAmount;
    private int fuelConsumption;
    private int tankVolume;
    private String serialNumber;
    private String brand;
    private String color;

    public Car(Engine engine, String brand, String color, String serialNumber, int fuelConsumption, int tankVolume) {
        this.engine = engine;
        this.brand = brand;
        this.color = color;
        this.serialNumber = serialNumber;
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = 0;
        this.tankVolume = tankVolume;
        this.mirrors = new ArrayList<>();
        this.wheels = new ArrayList<>();
    }

    public void addWheel(Wheel wheel) {
        this.wheels.add(wheel);
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void addMirror(RearMirror rearMirror) {
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void drive(int speed) {
        this.fuelAmount -= fuelConsumption;
        System.out.println("I am driving!");
        engine.drive(speed);
    }

    public void brake() {
        System.out.println("I am breaking");
    }

    public void turboBoost() {
        if (((double) fuelAmount / tankVolume > 0.1)) {
            System.out.println("Engaging super boost!");
        } else {
            System.out.println("Insufficient fuel for super boost");
        }

    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++)
            System.out.println("Tuuut");
    }


    public void getRemainingRange() {
        if (fuelConsumption != 0) {
            float remainingRange = (float) fuelAmount / fuelConsumption;
            System.out.println("Remaining range: " + remainingRange);
        } else {
            System.out.println("Error: Fuel consumption cannot be zero.");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}