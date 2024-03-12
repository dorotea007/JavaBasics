package at.tea.example_OO.phone;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private ArrayList<PhoneFile> phoneFiles;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.phoneFiles = new ArrayList<>();
    }

    public void saveFile(PhoneFile phoneFile) {
        this.phoneFiles.add(phoneFile);
    }

    public List<PhoneFile> getPhoneFiles() {
        return phoneFiles;
    }

    public int getFreeSpace() {
        int phoneFilesSize = 0;
        if (phoneFiles != null) {
            for (PhoneFile phoneFile : phoneFiles) {
                phoneFilesSize += phoneFile.getSize();
            }
        }
        return capacity - phoneFilesSize;
    }
}