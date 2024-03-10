package at.tea.example_OO.phone;

import java.util.ArrayList;

public class SDCard {
    private int capacity;
    private ArrayList<PhoneFile> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }
}
