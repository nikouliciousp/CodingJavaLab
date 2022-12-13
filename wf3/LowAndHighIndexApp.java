package gr.aueb.cf.projects.wf3;

/**
 * This app finds low and high position of a number-key in a sorted array.
 *
 * @author Periklis Nikoulis
 */
public class LowAndHighIndexApp {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 4, 4, 4, 4, 5};
        int[] returned;

        returned = getLowAndHighIndexOf(arr, 4);
        System.out.printf("(%d, %d)", returned[0] + 1, returned[1] + 1);
    }

    /**
     * Finds low and high position of a number-key in a sorted array.
     *
     * @param arr for a given array
     * @param key for a given key
     * @return int[] = {low, high}
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int low = 0;
        int high = 0;
        int pivot;
        boolean found = false;

        if (arr == null) return new int[] {};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                low = i;
                found = true;
                break;
            }
        }

        if (!found) return new int[] {};

        high = low;
        pivot = low + 1;

        while ((pivot < arr.length) && (arr[pivot] == key)) {
            high++;
        }

        return new int[] {low, high};
    }
}
