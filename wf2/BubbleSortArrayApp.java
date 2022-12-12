package gr.aueb.cf.projects.wf2;

/**
 * Implementation of the Bubble Sort.
 * Time Complexity of Bubble Sort Algorithm: O(n^2).
 *
 * @author Periklis Nikoulis
 */
public class BubbleSortArrayApp {
    public static void main(String[] args) {
        int[] arr = {7, 4, 9, 3, 54};

        System.out.println("Original array:");
        printArray(arr);

        System.out.println("Sorted array:");
        bubbleSort(arr);
        printArray(arr);
    }

    /**
     * Sorts by Bubble Sort Algorithm.
     *
     * @param arr for a given array
     */
    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * Swap the array's elements used by bubbleSort.
     *
     * @param arr for a given array
     * @param i for a given position
     * @param j for a given position
     */
    public static void swap(int[] arr, int i, int j) {
        int tmpValue = 0;

        tmpValue = arr[i];
        arr[i] = arr[j];
        arr[j] = tmpValue;
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
