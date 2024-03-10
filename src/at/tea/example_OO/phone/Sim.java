package at.tea.example_OO.phone;

public class Sim {
    private int id;
    private String number;

    public Sim(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public void doCall(String number) {
        System.out.println("Calling number: " + number);
    }
}
