package at.tea.OO_Einstieg;

public class Car {
    public int fuelAmount;
    public int fuelConsumption;
    public int tankVolume;
    public String serialNumber;
    public String brand;

    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("Ich fahre!");
    }

}