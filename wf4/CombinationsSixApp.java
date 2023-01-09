package gr.aueb.cf.projects.wf4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * This app generates all possible sixes (combinations of 6 numbers).
 * After generates each six it 'filters' each six to complete the
 * following:
 * 1) Contain at most 4 even numbers,
 * 2) contain at most 4 odd,
 * 3) contain at most 2 consecutive,
 * 4) contain at most 3 identical endings,
 * 5) contain at most 3 numbers in the same ten.
 *
 * @author Periklis Nikoulis
 */
public class CombinationsSixApp {

    public static void main(String[] args) throws FileNotFoundException {
        final int EVEN = 4;
        final int ODD = 4;
        final int CONTINUOUS = 2;
        final int TEN = 3;
        final int END = 3;
        final int N = 6;
        int numberOfInts = 0;
        int number = 0;

        File inFile = new File("C:\\Users\\pirat\\IdeaProjects\\CodingFactory\\src\\gr\\aueb\\cf\\projects\\wf4\\my-numbers-file.txt");
        File outFile = new File("C:\\Users\\pirat\\IdeaProjects\\CodingFactory\\src\\gr\\aueb\\cf\\projects\\wf4\\my-combinations-file.txt");

        Scanner in = new Scanner(inFile);
        PrintStream ps = new PrintStream(outFile);

        int[] row = new int[6];
        ArrayList<Integer> numbers = new ArrayList<>();

        while (in.hasNext()) {
            numberOfInts++;
            number = in.nextInt();
            if ((number >= 1) && (number <= 49)) {
                numbers.add(number);
            } else {
                numberOfInts = 0;
                break;
            }
        }

        Collections.sort(numbers);

        if ((numberOfInts >= 6) && (numberOfInts <= 49)) {
            for (int i = 0; i <= numbers.size() - N; i++) {
                for (int j = i + 1; j <= numbers.size() - N; j++) {
                    for (int k = j + 1; k <= numbers.size() - N + 2; k++) {
                        for (int m = k + 1; m < numbers.size(); m++) {
                            for (int n = m + 1; n < numbers.size(); n++) {
                                for (int l = n + 1; l < numbers.size(); l++) {
                                    row[0] = numbers.get(i);
                                    row[1] = numbers.get(j);
                                    row[2] = numbers.get(k);
                                    row[3] = numbers.get(m);
                                    row[4] = numbers.get(n);
                                    row[5] = numbers.get(l);

                                    if ((!isEven(row, EVEN)) && (!isOdd(row, ODD)) && (!isContinuous(row, CONTINUOUS)) &&
                                            (!isSameEnding(row, END)) && (!isSameTen(row, TEN))) {
                                        ps.printf("%d\t%d\t%d\t%d\t%d\t%d\n", row[0], row[1], row[2], row[3], row[4], row[5]);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Checks if evens numbers there are in a combination
     * are more than for a given number.
     *
     * @param row   for a given Array
     * @param even  for a given numbers of evens
     * @return      false if exist combination with more
     *              than the allowed evens numbers
     */
    public static boolean isEven(int[] row, int even) {
        int count = 0;

        for (int num : row) {
            if (num % 2 == 0) {
                count++;
            }
        }

        return (count > even);
    }

    /**
     * Checks if odds numbers there are in a combination
     * are more than for a given number.
     *
     * @param row   for a given Array
     * @param odd   for a given numbers of odds
     * @return      false if exist combination with more
     *              than the allowed odds numbers
     */
    public static boolean isOdd(int[] row, int odd) {
        int count = 0;

        for (int num : row) {
            if (!(num % 2 == 0)) {
                count++;
            }
        }

        return (count > odd);
    }

    /**
     * Checks for consecutive numbers.
     *
     * @param row           for a given Array
     * @param continuous    for a given consecutive numbers allowed
     * @return              false if exist combination with more than the
     *                      allowed consecutive numbers
     */
    public static boolean isContinuous(int[] row, int continuous) {
        int count = 1;

        for (int i = 1; i < row.length; i++) {
            if (row[i - 1] == row[i] + 1) {
                count++;
                if (count > continuous) {
                    break;
                }
            } else {
                count = 1;
            }
        }

        return (count > continuous);
    }

    /**
     * Checks for same ending numbers.
     *
     * @param row   for a given number
     * @param end   for a given number of endings
     * @return      false if exist combination with
     *              more than the allowed ending numbers
     */
    public static boolean isSameEnding(int[] row, int end) {
        int[] tempArr = new int[10];
        int temp = 0;

        for (int i = 0; i < row.length; i++) {
            temp = row[i] % 10;
            tempArr[temp]++;
        }

        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] > end) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param row   for a given Array
     * @param ten   for a given number of numbers belonging to the same ten
     * @return      false if exist combination with
     *              more than the allowed numbers belonging to the same ten
     */
    public static boolean isSameTen(int[] row, int ten) {
        int[] tempArr = new int[5];
        int temp = 0;

        for (int i = 0; i < row.length; i++) {
            temp = row[i] / 10;
            tempArr[temp]++;
        }

        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] > ten) {
                return true;
            }
        }
        return false;
    }
}
