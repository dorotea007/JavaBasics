package at.tea.example_OO.phone;

public class Camera {
    int resolution;

    public Camera(int resolution) {
        this.resolution = resolution;
    }


    public PhoneFile makePicture(String extension, String name) {
        PhoneFile phoneFile = new PhoneFile(extension, resolution * resolution, name);
        return phoneFile;

    }
}
