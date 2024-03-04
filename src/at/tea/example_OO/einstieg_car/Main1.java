package at.tea.example_OO.einstieg_car;

import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        //Create Engine, RearMirror and Wheel instances
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, 40);
        Wheel w1 = new Wheel(20, 30);
        Wheel w2 = new Wheel(60, 80);
        Wheel w3 = new Wheel(60, 80);
        Wheel w4 = new Wheel(20, 30);

        //Create Car
        Car c1 = new Car(e1, "Audi", "black", "A1234", 20, 200);

        //Add mirrors and wheels to the car
        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.addWheel(w1);
        c1.addWheel(w2);
        c1.addWheel(w3);
        c1.addWheel(w4);

        // Mirror actions
        int mirrorSize = r1.getSize();
        System.out.println("Mirror Size: " + mirrorSize);

        r1.setSize(120);
        mirrorSize = r1.getSize();
        System.out.println("Updated Mirror Size: " + mirrorSize);

        r1.setPosition(10);

        // Wheel actions
        int wheelSize = w1.getSize();
        System.out.println("Wheel Size: " + wheelSize);

        w1.setSize(15);
        wheelSize = w1.getSize();
        System.out.println("Updated Wheel Size: " + wheelSize);

        w1.setPosition(30);
        int wheelPosition = c1.getWheels().get(0).getPosition();
        System.out.println("Wheel Position: " + wheelPosition);

        // Access mirrors using getMirrors() method
        List<RearMirror> carMirrors = c1.getMirrors();

        // Display information about each mirror
        for (RearMirror mirror : carMirrors) {
            System.out.println("Mirror Size: " + mirror.getSize());
            System.out.println("Mirror Position: " + mirror.getPosition());
        }

        //Engine actions
        e1.setHorsePower(160);
        e1.setType(Engine.TYPE.GAS);

        //Car actions
        c1.drive(60);
        c1.brake();
        c1.turboBoost();
        c1.honk(3);
        c1.getRemainingRange();

        //Modify Car properties
        c1.setBrand("BMW");
        c1.setColor("white");
        c1.setFuelAmount(50);
        c1.setFuelConsumption(25);
        c1.setTankVolume(250);
        c1.setSerialNumber("B5678");

        Engine e2 = new Engine(180, Engine.TYPE.GAS);
        c1.setEngine(e2);

        // Display Car information
        displayCarInformation(c1);
    }

    private static void displayCarInformation(Car car) {
        System.out.println("Car Information:");
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Color: " + car.getColor());
        System.out.println("Fuel Amount: " + car.getFuelAmount());
        System.out.println("Fuel Consumption: " + car.getFuelConsumption());
        System.out.println("Tank Volume: " + car.getTankVolume());
        System.out.println("Serial Number: " + car.getSerialNumber());
        System.out.println("Remaining Range: ");
        car.getRemainingRange();
        System.out.println("Engine Information:");
        System.out.println("Horsepower: " + car.getEngine().getHorsePower());
        System.out.println("Engine Type: " + car.getEngine().getType());
    }
}
