package at.tea.example_OO.lamp;

public class Main {
    public static void main(String[] args) {

        Lamp lamp = new Lamp();

        LightElement l1 = new LightElement("l1", "red");
        LightElement l2 = new LightElement("l2", "yellow");
        LightElement l3 = new LightElement("l3", "green");

        lamp.addLightElement(l1);
        lamp.addLightElement(l2);
        lamp.addLightElement(l3);

        System.out.println(lamp.getOverallPowerUsage());
        lamp.turnAllOn();
        System.out.println(lamp.getOverallPowerUsage());
        lamp.turnAllOn();
        lamp.printNamesOfLightElements();

        String colorOfL1 = l1.getColor();
        System.out.println("The color of l1 is: " + colorOfL1);
        String colorOfL2 = l2.getColor();
        System.out.println("The color of l2 is: " + colorOfL2);
        String colorOfL3 = l3.getColor();
        System.out.println("The color of l3 is: " + colorOfL3);


    }
}
