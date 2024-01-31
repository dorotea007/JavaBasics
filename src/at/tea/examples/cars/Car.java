package at.tea.examples.cars;

public class Car {
    private String color;
    private int maxVelocity;
    private int basePrice;
    private int price;
    private double baseConsumption;
    private double consumption;
    private int distance;
    private Producer producer;
    private Engine engine;

    public Car(String color, int maxVelocity, int basePrice, double baseConsumption, Producer producer, Engine engine, int distance) {
        this.color = color;
        this.maxVelocity = maxVelocity;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.producer = producer;
        this.engine = engine;
        this.distance = distance;
        calculatePrice();
        calculateConsumption();
    }

    // Calculate discounted price based on the producer's discount
    private void calculatePrice() {
        double discount = producer.getDiscount() / 100.0;
        this.price = (int) (this.basePrice - (discount * this.basePrice));
    }

    // Calculate fuel consumption based on the car's distance traveled
    private void calculateConsumption() {
        // Check if the distance traveled is less than 50000
        if (this.distance < 50000) {
            // If true, set consumption to the base consumption
            this.consumption = this.baseConsumption;
        } else {
            // If false, set consumption to base consumption multiplied by 1.098
            this.consumption = this.baseConsumption * 1.098;
        }
    }

    public int getPrice() {
        return price;
    }

    public double getConsumption() {
        return consumption;
    }

    //car details
    public void printCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Color: " + color);
        System.out.println("Max Velocity: " + maxVelocity);
        System.out.println("Base Price: " + basePrice);
        System.out.println("Price: " + price);
        System.out.println("Base Consumption: " + baseConsumption);
        System.out.println("Consumption: " + consumption);
        System.out.println("Distance: " + distance);
        System.out.println("Producer: " + producer.getName());
        System.out.println("Engine Type: " + engine.getType());
        System.out.println("Engine Performance: " + engine.getPerformance());
    }
}
