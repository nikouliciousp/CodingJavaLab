package gr.aueb.cf.projects.wf1;

import java.util.Scanner;

/**
 * This app calculate the Fibonacci Series
 * a given number.
 * fn = fn-1 + fn-2
 *
 * @author Periklis Nikoulis
 */
public class FibonacciSeriesApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;
        int fibo = 0;


        System.out.println("Please insert a num (int):");
        number = in.nextInt();


        fibo = fibonacci(number);
        if (fibo <= 0) {
            System.out.println("Wrong input int");
        } else {
            System.out.printf("Fibonacci(%d) = %d", number, fibo);
        }
    }

    /**
     * Calculates Fibonacci number using recurion
     *
     * @param number for a given number
     * @return Fibonacci number
     */
    public static int fibonacci(int number) {
        if (number <= 0) {
            return -1;
        }
        if ((number == 1) || (number == 2)) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
