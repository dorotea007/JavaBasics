package at.tea.example.lamp;

public class LightElement {
    private String name;
    private String color;
    private int powerUsage;
    private boolean state;

    public LightElement(String name, String color) {
        this.name = name;
        this.color = color;
        this.powerUsage = 0;
        this.state = false;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public void turnOn() {
        if (this.state) {
            System.out.println("Mein Name ist " + this.name + ". Ich bin bereits eingeschaltet.");
        } else {
            this.state = true;
            this.powerUsage += 5; // Bei jedem einschalten steigt der Stromverbrauch um den Wert 5.

        }
    }
}
