package gr.aueb.cf.projects.wf3;

/**
 * This application encrypts and decrypts a message based on the ASCII
 * and a key.
 *
 * @author Periklis Nikoulis
 */
public class CryptoApp {

    public static void main(String[] args) {
        String s = "JULIUS CAESAR";
        final int KEY = 3;

        String encrypted = encrypt(s, KEY);
        System.out.println(encrypted);

        String decrypted = decrypt(encrypted, KEY);
        System.out.println(decrypted);
    }

    /**
     * Encrypts a String message based on the ASCII
     * and a key.
     *
     * @param s     for a given String
     * @param key   for a given KEY
     * @return      Encrypted String
     */
    public static String encrypt(String s, int key) {
        StringBuilder encrypted = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                encrypted.append(cipher(ch, key));
            } else {
                encrypted.append(ch);
            }
        }

        return encrypted.toString();
    }

    /**
     * Decrypted a String message based on the ASCII
     * and a key.
     *
     * @param s     for a given String
     * @param key   for a given KEY
     * @return      Decrypted String
     */
    public static String decrypt(String s, int key) {
        StringBuilder decrypted = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                decrypted.append(decipher(ch, key));
            } else {
                decrypted.append(ch);
            }
        }

        return decrypted.toString();
    }

    /**
     * Ciphers a char based on the ASCII
     * and a key.
     *
     * @param ch for a given Character
     * @param key for a given KEY
     * @return Ciphered Character
     */
    public static char cipher(char ch, int key) {
        int m;
        int c;

        m = ch - 65;
        c = (m + key) % 26; //0-25

        return (char) (c + 65);
    }

    /**
     * Deciphers a char based on the ASCII
     * and a key.
     *
     * @param ch for a given Character
     * @param key for a given KEY
     * @return Deciphered Character
     */
    public static char decipher(int ch, int key) {
        int m;
        int c;

        c = ch - 65;
        m = ((c - key) + 26) % 26;

        return (char) (m + 65);
    }
}
