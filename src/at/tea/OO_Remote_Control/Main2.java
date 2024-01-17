package at.tea.OO_Remote_Control;

public class Main2 {
    public static void main(String[] args) {
        // Zwei Batterien erstellen

        Battery battery1 = new Battery(100);
        Battery battery2 = new Battery(100);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.addBattery(battery1);
        remoteControl.addBattery(battery2);

        System.out.println("Ladestatus vor dem Einschalten: " + remoteControl.getStatus() + "%");
        remoteControl.turnOn();
        System.out.println("Ladestatus nach dem Einschalten: " + remoteControl.getStatus() + "%");
        remoteControl.turnOff();
        System.out.println("Ladestatus nach dem Ausschalten: " + remoteControl.getStatus() + "%");
    }
}
