package gr.aueb.cf.projects.wf1;

import java.util.Scanner;

/**
 * This app checks if a year is a leap or not.
 *
 * @author Periklis Nikoulis
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;

        System.out.println("Please enter a year:");
        year = in.nextInt();

        isLeapYear(year);
    }

    /**
     * Checks if a given year is a leap.
     *
     * @param year for a given year
     */
    public static void isLeapYear(int year) {
        if (year <= 0) {
            System.out.println("Wrong year!");
        } else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("The year " + year + " is a leap!");
        }
        else {
            System.out.println("To έτος " + year + " is not a leap.");
        }
    }
}
