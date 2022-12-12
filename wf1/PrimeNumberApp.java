package gr.aueb.cf.projects.wf1;

import java.util.Scanner;

/**
 * This app check if a given number is prime or not.
 * A prime number is a number which is not divisible
 * by any other number.
 *
 * @author Periklis Nikoulis
 */
public class PrimeNumberApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert a num (int):");
        num = in.nextInt();

        System.out.printf("The %d is %s", num, isPrimeOrNot(num));
    }

    /**
     * Checks if a number is prime or not
     *
     * @param num for a given number
     * @return string
     */
    public static String isPrimeOrNot(int num) {
        if (num < 0) {
            return "not valid";
        }
        if ((num == 0) || (num == 1)) {
            return "not a prime";
        }
        if ((num == 2) || (num == 3)) {
            return "a prime number";
        }
        if ((((num * num) - 1) % 24) == 0) {
            return "a prime number";
        } else {
            return "not a prime";
        }
    }
}
