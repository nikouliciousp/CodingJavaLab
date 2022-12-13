package gr.aueb.cf.projects.wf3;

import java.util.Scanner;

/**
 * This app prints patterns of stars.
 *
 * @author Periklis Nikoulis
 */
public class StarsApp {

    final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        String response;

        do {
            printMenu();
            response = getChoice();
            try {
                if (response.matches("[qQ]")) {
                    quit = true;
                } else {
                    printOnChoice(response);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Choice");
            }
        } while (!quit);
    }

    /**
     * Prints menu.
     */
    public static void printMenu() {
        System.out.println("Please select one of the following: ");
        System.out.println("1. Print H");
        System.out.println("2. Print V");
        System.out.println("3. Print HV");
        System.out.println("4. Print HV Asc");
        System.out.println("5. Print HV Desc");
        System.out.println("Q or q to Quit");
    }

    /**
     * Reads a String from stdin.
     *
     * @return String
     */
    public static String getChoice() {
        return in.nextLine().trim();
    }

    /**
     * Prints user choice.
     *
     * @param s for a given String
     * @throws IllegalArgumentException
     */
    public static void printOnChoice(String s) throws IllegalArgumentException {
        int choice;
        int n = 0;

        try {
            choice = Integer.parseInt(s);
            System.out.println("Please insert the number of stars");
            n = Integer.parseInt(getChoice());

            switch (choice) {
                case 1:
                    printStarsH(n);
                    System.out.println();
                    break;
                case 2:
                    printStarsV(n);
                    System.out.println();
                    break;
                case 3:
                    printStarsHV(n);
                    System.out.println();
                    break;
                case 4:
                    printStarsHVAsc(n);
                    System.out.println();
                    break;
                case 5:
                    printStarsHVDesc(n);
                    System.out.println();
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Prints Horizontal Stars.
     *
     * @param n number of stars
     */
    public static void printStarsH(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print("*");
        }
    }

    /**
     * Prints Vertical Stars.
     *
     * @param n number of stars
     */
    public static void printStarsV(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println("*");
        }
    }

    /**
     * Prints Horizontal - Vertical Stars.
     *
     * @param n number of stars
     */
    public static void printStarsHV(int n) {
        for (int i = 0; i <= n; i++) {
            printStarsH(n);
            System.out.println();
        }
    }

    /**
     * Prints Horizontal - Vertical Asc Stars.
     *
     * @param n number of stars
     */
    public static void printStarsHVAsc(int n) {
        for (int i = 0; i <= n; i++) {
            printStarsH(i);
            System.out.println();
        }
    }

    /**
     * Prints Horizontal - Vertical Desc Stars.
     *
     * @param n number of stars
     */
    public static void printStarsHVDesc(int n) {
        for (int i = n; i >= 0; i--) {
            printStarsH(i);
            System.out.println();
        }
    }
}
