package at.tea.OO_Einstieg;

public class Car {
    private Engine engine;
    private int honkCounter;
    private int fuelAmount;
    private int fuelConsumption;
    private int tankVolume;
    private String serialNumber;
    private String brand;
    private String color;
    private int speed;

    public Car(Engine engine, String brand, String color) {
        this.engine = engine;
        this.brand = brand;
        this.color = color;
        this.honkCounter = 0;
    }

    public void drive(int speed) {
        if (fuelAmount >= fuelConsumption) {
            this.fuelAmount -= fuelConsumption;
            System.out.println("I am driving!");
        } else {
            System.out.println("Not enough fuel to drive!");
        }
    }

    public void brake() {

        System.out.println("I am breaking");
    }

    public void turboBoost() {
        double fuelPercentage = ((double) fuelAmount / tankVolume);
        if (fuelPercentage > 0.1) {
            System.out.println("Engaging super boost!");
        } else {
            System.out.println("Insufficient fuel for super boost");
        }

    }

    public void honk() {
        System.out.println("Ich bin ein " + this.brand + " und habe die Farbe " + this.color + " und habe " + this.engine.getHorsePower() + " PS");
        this.honkCounter++;
    }


    public void getRemainingRange() {
        if (fuelConsumption != 0) {
            float remainingRange = (float) fuelAmount / fuelConsumption;
            System.out.println("Remaining range: " + remainingRange);
        } else {
            System.out.println("Error: Fuel consumption cannot be zero.");
        }
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
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

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getTankVolume() {
        return tankVolume;
    }


    public String getSerialNumber() {
        return serialNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


}