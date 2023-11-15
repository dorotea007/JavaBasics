package at.tea.OO_Einstieg;

public class Car {
    private int fuelAmount;
    public int fuelConsumption;
    private int tankVolume;
    private String serialNumber;
    private String brand;
    private String color;

    public Car(int fuelConsumption, String brand, String serialNumber) {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving!");
    }

    public void brake() {

        System.out.println("Ich bremse!");
    }

    public void turboBoost() {
        double fuelPercentage = ((double) fuelAmount / tankVolume);
        if (fuelPercentage > 0.1) {
            System.out.println("Engaging super boost!");
        } else {
            System.out.println("Insufficient fuel for super boost");
        }

    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}