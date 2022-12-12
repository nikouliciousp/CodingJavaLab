package gr.aueb.cf.projects.wf2;

/**
 * Implementation of the Counting Sort.
 * Time Complexity of Counting Sort Algorithm: O(n+k).
 *
 * @author Periklis Nikoulis
 */
public class CountingSortArrayApp {

    public static void main(String[] args) {
        int[] arr = {60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40};
        int k = 60;

        System.out.println("Original array:");
        printArray(arr);

        System.out.println("Sorted array:");
        countingSort(arr, k);
        printArray(arr);
    }

    /**
     * Sorts by Counting Sort Algorithm.
     *
     * @param arr for a given array
     * @param k for a given int to create k + 1  buckets
     */
    public static void countingSort(int[] arr, int k) {
        int counter[] = new int[k + 1];
        int index = 0;

        //Fill buckets
        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }

        for (int i = 0; i < counter.length; i++) {
            while (counter[i] > 0) {
                arr[index++] = i;
                counter[i]--;
            }
        }
    }

    /**
     * Prints an array.
     *
     * @param arr for a given array
     */
    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
