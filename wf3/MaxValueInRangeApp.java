package gr.aueb.cf.projects.wf3;

/**
 * This app finds a max value in a specific range into Array.
 *
 * @author Periklis Nikoulis
 */
public class MaxValueInRangeApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 9, 5};
        int maxPos;

        maxPos = getMaxValueInRange(arr, 0, arr.length - 1);
        if (maxPos == -1) System.exit(1);
        System.out.println(arr[maxPos]);
    }

    /**
     * Finds max value in a specific range into Array.
     *
     * @param arr   for a given Array
     * @param low   for a given low
     * @param high  for a given high
     * @return      max value in range
     */
    public static int getMaxValueInRange(int[] arr, int low, int high) {
        int maxPosition = 0;
        int maxValue = 0;

        if ((arr == null) || (arr.length < 1)) return -1;
        if ((low < 0) || (high > arr.length -1) || (low > high)) return -1;

        maxValue = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }

        return maxPosition;
    }
}
