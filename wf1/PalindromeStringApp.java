package gr.aueb.cf.projects.wf1;

/**
 * This app check if a given string is palindrome or not.
 * Palindrome is a string when it can also be read in reverse
 * e.g "asdfdsa".
 *
 * @author Periklis Nikoulis
 */
public class PalindromeStringApp {

    public static void main(String[] args) {
        String inputChar = "asa";

        System.out.println("Is " + inputChar + " palindrome? " + isPalindromString(inputChar));
    }

    /**
     * Reverses a string using for.
     *
     * @param inputString a given string
     * @return reversed string of inputString
     */
    public static String reverseString(String inputString) {
        if ((inputString == null) || inputString.isEmpty()) {
            return inputString;
        }

        String tmpString = "";
        char ch;

        for (int i = 0; i < inputString.length(); i++) {
            ch = inputString.charAt(i);
            tmpString = ch + tmpString;
        }
        return tmpString;
    }

    /**
     * Checks a strings if is palindrome.
     *
     * @param inputString a given string
     * @return true if is Palindrome and false otherwise
     */
    public static boolean isPalindromString(String inputString) {
        String reverse = reverseString(inputString);

        if (inputString.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }
}
