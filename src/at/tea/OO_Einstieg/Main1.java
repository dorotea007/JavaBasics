package at.tea.OO_Einstieg;

public class Main1 {
    public static void main(String[] args) {
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, 40);

        Wheel w1 = new Wheel(10, 20);
        Wheel w2 = new Wheel(50, 70);
        Wheel w3 = new Wheel(60, 30);
        Wheel w4 = new Wheel(90, 20);

        Car c1 = new Car(e1, "Audi", "black", "A1234", 20, 200);
        c1.addMirror(r1);
        c1.addMirror(r2);

        c1.addWheel(w1);
        c1.addWheel(w2);
        c1.addWheel(w3);
        c1.addWheel(w4);

        System.out.println(c1.getWheels().get(0).getPosition());
        System.out.println(c1.getMirrors().get(0).getPosition());
        System.out.println(c1.getEngine().getHorsePower());
    }
}
