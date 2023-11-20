package at.tea.OO_Einstieg;

public class Main1 {
    public static void main(String[] args) {
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        Car c1 = new Car(e1,"Audi", "black");

        System.out.println(c1.getEngine().getHorsePower());
    }
}
