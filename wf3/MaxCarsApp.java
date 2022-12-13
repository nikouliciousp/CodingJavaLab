package gr.aueb.cf.projects.wf3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * This application finds the maximum number of cars
 * that are parked at the same time.
 *
 * @author Periklis Nikoulis
 */
public class MaxCarsApp {

    public static void main(String[] args) {
        int[][] arr = { {1000, 1400},
                        {1000, 1400},
                        {1000, 1030},
                        {1040, 1400},
                        {1045, 1400}};

        int[][] transformed;

        transformed = transformArray(arr);
        sortByTime(transformed);
        System.out.println(getMaxContinuesZeroes(transformed));
    }

    /**
     * Transforms {1000, 1030} -> {1000, 1}, {1030, 0}.
     *
     * @param arr   for a given Array
     * @return      transformed Array
     */
    public static int[][] transformArray(int[][] arr) {
        int[][] transformed = new int[arr.length * 2][2];

        for (int i = 0; i < arr.length; i++) {
            transformed[i * 2][0] = arr[i][0];
            transformed[i * 2][1] = 1;
            transformed[(i * 2) + 1][0] = arr[i][1];
            transformed[(i * 2) + 1][1] = 0;
        }
        return transformed;
    }

    /**
     * Sorts a two-dimensional array by the first column.
     *
     * @param arr sorted Array
     */
    public static void sortByTime(int[][] arr) {
        Arrays.sort(arr, Comparator.comparing((int[] a) -> a[0]));
    }

    /**
     * Calculates the max number of cars that are parked
     * at the same time.
     *
     * @param arr   for a given Array
     * @return      max number of cars
     */
    public static int getMaxContinuesZeroes(int[][] arr) {
        int zeroes = 0;
        int maxZeroes = 0;

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i][1] == 0) {
                if (maxZeroes < zeroes) {
                    maxZeroes = zeroes;
                }
                zeroes--;
            } else {
                zeroes++;
            }
        }

        return maxZeroes;
    }
}
