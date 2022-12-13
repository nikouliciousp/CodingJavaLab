package gr.aueb.cf.projects.wf4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
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

    public static boolean isEven(int[] row, int even) {
        int count = 0;

        for (int num : row) {
            if (num % 2 == 0) {
                count++;
            }
        }

        return (count > even);
    }

    public static boolean isOdd(int[] row, int odd) {
        int count = 0;

        for (int num : row) {
            if (!(num % 2 == 0)) {
                count++;
            }
        }

        return (count > odd);
    }

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

    public static boolean isSameEnding(int[] row, int end) {
        int count = 1;

        for (int i = 0; i < row.length - 1; i++) {
            if (row[row.length - 1] == row[i]) {
                count++;
                if (count > end) {
                    break;
                }
            }
        }

        return (count > end);
    }

    public static boolean isSameTen(int[] row, int ten) {
        int count10 = 0;
        int count20 = 0;
        int count30 = 0;
        int count40 = 0;
        int count50 = 0;

        for (int i = 0; i < row.length; i++) {
            if (row[i] <= 10) {
                count10++;
                if (count10 > ten) {
                    break;
                }
            } else if (row[i] <= 20) {
                count20++;
                if (count20 > ten) {
                    break;
                }
            } else if (row[i] <= 30) {
                count30++;
                if (count30 > ten) {
                    break;
                }
            } else if (row[i] <= 40) {
                count40++;
                if (count40 > ten) {
                    break;
                }
            }else {
                count50++;
                if (count50 > ten) {
                    break;
                }
            }
        }

        return ((count10 > ten) || (count20 > ten) || (count30 > ten) || (count40 > ten) || (count50 > ten));
    }
}
