package at.tea.examples.cars;

public class Main3 {
    public static void main(String[] args) {


        Producer p1 = new Producer("Lec", "Spain", 0.4);

        Engine e1 = new Engine(Engine.TYPE.DIESEL, 20);
        Car c1 = new Car("black", 400, 300000, 10, p1, e1, 90000);

        System.out.println("Price: " + c1.getPrice());
        System.out.println("Consumption: " + c1.getConsumption());

    }
}
