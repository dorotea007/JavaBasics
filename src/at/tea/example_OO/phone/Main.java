package at.tea.example_OO.phone;

public class Main {
    public static void main(String[] args) {
        PhoneFile file1 = new PhoneFile("jpg", 2,"image");
        PhoneFile file2 = new PhoneFile("docx", 5,"inhalt");
        PhoneFile file3 = new PhoneFile("pdf", 7,"Musik");
        SDCard sdCard = new SDCard(30);


        sdCard.saveFile(file1);
        sdCard.saveFile(file2);
        sdCard.saveFile(file3);



    }
}
