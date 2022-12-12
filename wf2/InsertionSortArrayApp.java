package gr.aueb.cf.projects.wf2;

/**
 * Implementation of the Insertion Sort.
 * Time Complexity of Insertion Sort Algorithm: O(n^2).
 *
 * @author Periklis Nikoulis
 */
public class InsertionSortArrayApp {

    public static void main(String[] args) {
        int[] arr = {7, 4, 9, 3, 54};

        System.out.println("Original array:");
        printArray(arr);

        System.out.println("Sorted array:");
        insertionSort(arr);
        printArray(arr);
    }

    /**
     * Sorts by Insertion Sort algorithm.
     *
     * @param arr for a given array
     */
    public static void insertionSort(int[] arr) {
        int tmp = 0;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            tmp = arr[i];
            j = i;

            while ((j > 0) && (arr[j - 1] > tmp)) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = tmp;
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
