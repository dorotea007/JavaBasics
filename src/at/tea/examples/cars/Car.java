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

    private void calculatePrice() {
        double discount = producer.getDiscount() / 100.0;
        this.price = (int) (this.basePrice - (discount * this.basePrice));
    }

    private void calculateConsumption() {
        if (this.distance < 50000) {
            this.consumption = this.baseConsumption;
        } else {
            this.consumption = this.baseConsumption * 1.098;
        }
    }

    public int getPrice() {
        return price;
    }

    public double getConsumption() {
        return consumption;
    }
}
