package at.tea.OO_Einstieg;

public class Main1 {
    public static void main(String[] args) {
        Car c1 = new Car(7, "Audi", "A1234");
        c1.setTankVolume(100);
        c1.setFuelAmount(20);

        Car c2 = new Car(6, "Mercedes", "M1234");
        c2.setTankVolume(50);
        c2.setFuelAmount(20);

        c1.drive();
        c1.brake();
        c1.turboBoost();
        c1.honk(2);
        c1.getRemainingRange();
        c1.setFuelConsumption(7);
        c1.setSerialNumber("A1234");
        c1.setColor("Blue");
        c1.setBrand("Audi");
        int fuelAmountC1 = c1.getFuelAmount();
        int fuelConsumptionC1 = c1.getFuelConsumption();
        int tankVolumeC1 = c1.getTankVolume();
        String brandC1 = c1.getBrand();
        String serialNumberC1 = c1.getSerialNumber();
        String colorC1 = c1.getColor();


        // Printing the values
        System.out.println("fuelAmountC1: " + fuelAmountC1);
        System.out.println("fuelConsumptionC1: " + fuelConsumptionC1);
        System.out.println("tankVolumeC1: " + tankVolumeC1);
        System.out.println("brandC1: " + brandC1);
        System.out.println("serialNumberC1: " + serialNumberC1);
        System.out.println("colorC1: " + colorC1);

    }
}
