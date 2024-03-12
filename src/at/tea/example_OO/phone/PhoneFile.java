package at.tea.example_OO.phone;

public class PhoneFile {
    private String extension;
    private int sizeInMB;
    private String name;

    public PhoneFile(String extension, int sizeInMB, String name) {
        this.extension = extension;
        this.sizeInMB = sizeInMB;
        this.name = name;
    }

    public String getInfo() {
        return name + "." + extension + " hat eine größe von: " + sizeInMB;
    }

    public String getExtension() {
        return extension;
    }

    public int getSize() {
        return sizeInMB;
    }

    public String getName() {
        return name;
    }
}
