package at.tea.OO_Einstieg;

public class Main1 {
    public static void main(String[] args) {
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, 40);

        Car c1 = new Car(e1, "Audi", "black", "A1234", 20, 200);
        c1.addMirror(r1);
        c1.addMirror(r2);

        System.out.println(c1.getMirrors().get(0).getPosition());
        System.out.println(c1.getEngine().getHorsePower());
    }
}
