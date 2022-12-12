package gr.aueb.cf.projects.wf3;

import java.util.Scanner;

/**
 * This app prints a menu.
 *
 * @author Periklis Nikoulis
 */
public class MenuApp {

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
        System.out.println("1. Insert");
        System.out.println("2. Update");
        System.out.println("3. Delete");
        System.out.println("4. Select");
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

        try {
            choice = Integer.parseInt(s);

            switch (choice) {
                case 1:
                    System.out.println("1. Insert");
                    break;
                case 2:
                    System.out.println("2. Update");
                    break;
                case 3:
                    System.out.println("3. Delete");
                    break;
                case 4:
                    System.out.println("4. Select");
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            throw e;
        }
    }
}
