package gr.aueb.cf.projects.wf3;

import java.util.Arrays;
import java.util.Comparator;

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

        for (int[] row : transformed) {
            System.out.println(row[0]);
        }

    }

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

    public static void sortByTime(int[][] arr) {
        Arrays.sort(arr, Comparator.comparing((int[] a) -> a[0]));
    }

    public static int getMaxOnes(int[][] arr) {
        int times = 0;
        int maxTimes = 0;
        int i = 0;

        while (i < arr.length) {
            while ((i < arr.length) && (arr[i++][1] == 1)) {
                times++;
            }
            if (times > maxTimes) {
                maxTimes = times;
            }
        }

        return maxTimes;
    }
}
