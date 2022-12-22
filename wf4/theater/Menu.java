package gr.aueb.cf.projects.wf4.theater;

import java.util.Scanner;

public class Menu {
    Theater theater;


    /**
     * Creates a Menu of Theater
     * and handles it.
     */
    public Menu() {
        this.theater = new Theater();
        modeMenu();
    }

    /**
     * Prints Menu Choice of Theater.
     */
    private void printMenu() {
        System.out.println("Please select one of the following:");
        System.out.println("1. Book");
        System.out.println("2. Cancel");
        System.out.println("3. Print Seats");
        System.out.println("4. Exit");
    }

    /**
     * Handles Menu Choice of Theater.
     */
    private void modeMenu() {
        Scanner in = new Scanner(System.in);
        int exit = 0;
        String str;

        while (exit != 4) {
            printMenu();
            if (!in.hasNextInt()) {
                System.out.println("Please insert an int for choice... eg '1' ");
                str = in.next();
                continue;
            }

            exit = in.nextInt();
            if ((exit < 1) || (exit > 4)) {
                System.out.println("Please insert an int with range 1 - 4 for choice...");
                continue;
            }

            switch (exit) {
                case 1:
                    this.theater.bookSeat();
                    break;
                case 2:
                    this.theater.cancelSeat();
                    break;
                case 3:
                    this.theater.printSeatsTheater();
                    break;
                case 4:
                    exit = 4;
                    break;
            }
        }
        System.out.println("Thank you for using our TheaterApp!");
    }
}
