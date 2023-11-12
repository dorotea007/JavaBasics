package at.tea.OO_Einstieg;

public class Car {
    public int fuelAmount;
    public int fuelConsumption;
    public int tankVolume;
    public String serialNumber;
    public String brand;

    //Methode
    public void setColor(String color) {
        System.out.println("Car color set to: " + color);
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
        for (int i = 0; i < amountOfRepetitions; i++){
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
}
