package at.tea.exercise;

public class CaeserCipher {
    public static String caesar(String text, int shift, boolean encrypt) {
        StringBuilder result = new StringBuilder();
        shift = encrypt ? shift : 26 - shift; // Für Entschlüsselung umkehren
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char encryptedChar = (char) (base + (c - base + shift) % 26);
                result.append(encryptedChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String originalText = "AbC aBc";
        int shift = 2;
        String encryptedText = caesar(originalText, shift, true);
        String decryptedText = caesar(encryptedText, shift, false);
        System.out.println("Original: " + originalText);
        System.out.println("Encrypted: " + encryptedText);
        System.out.println("Decrypted: " + decryptedText);
    }

}
