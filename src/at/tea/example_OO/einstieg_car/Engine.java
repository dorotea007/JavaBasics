package at.tea.example_OO.einstieg_car;

public class Engine {

    public enum TYPE {DIESEL, GAS}

    private int horsePower;
    private TYPE type;

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public void drive(int amount) {
        System.out.println("The motor is running with " + amount);
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}

