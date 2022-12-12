package gr.aueb.cf.projects.wf2;

/**
 * Implementation of the Selection Sort.
 *
 * @author Periklis Nikoulis
 */
public class SelectionSortArrayApp {
    public static void main(String[] args) {
        int[] arr = {7, 4, 9, 3, 10};

        System.out.println("Original array:");
        printArray(arr);

        System.out.println("Sorted array:");
        selectionSort(arr);
        printArray(arr);
    }

    /**
     * Sorts by Selection Sort algorithm.
     *
     * @param arr for a given array
     */
    public static void selectionSort(int[] arr) {
        int minValue = 0;
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            minPosition = i;
            minValue = arr[minPosition];

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minPosition = j;
                    minValue = arr[i];
                }
            }
            swap(arr, i, minPosition);
        }
    }

    /**
     * Swap the array's elements used by selectionSort.
     *
     * @param arr for a given array
     * @param i for a given position
     * @param j for a given position of min value
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
