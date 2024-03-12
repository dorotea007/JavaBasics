package at.tea.example_OO.phone;

public class Phone {
    String color;
    Sim simCard;
    Camera camera;
    SDCard sdCard;

    public Phone(String color, Sim simCard, Camera camera, SDCard sdCard) {
        this.color = color;
        this.simCard = simCard;
        this.camera = camera;
        this.sdCard = sdCard;
    }

}
