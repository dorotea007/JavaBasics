package at.tea.example.lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<LightElement> lightElements;

    public Lamp() {
        this.lightElements = new ArrayList<>();
    }

    public void addLightElement(LightElement lightElement) {
        this.lightElements.add(lightElement);
    }

    public void turnAllOn() { //alle Glühelemente werden eingeschaltet
        for (LightElement lightElement : this.lightElements) {
            lightElement.turnOn();
        }
    }

    public double getOverallPowerUsage() { //Liefert den bisher verbrauchten Strom aller Glühelemente zurück
        int sum = 0;
        for (LightElement lightElement : this.lightElements) {
            sum += lightElement.getPowerUsage();
        }
        return (double) sum / this.lightElements.size();
    }

    public void printNamesOfLightElements() { //Printet die Namen aller Lichtelemen auf die Konsole
        for (LightElement lightElement : this.lightElements) {
            System.out.println(lightElement.getName());
        }
    }
}
