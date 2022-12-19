package gr.aueb.cf.projects.wf4;

import java.util.Arrays;

/**
 * This app copies an array with two methods.
 * With the shallow copy method, changes to the values of one table
 * affect the values of the original table.
 * With the deep copy method, changes to the values of one table
 * do not affect the values of the original table.
 *
 * @author Periklis Nikoulis
 */
public class ShallowDeppCopyArrayApp {

    public static void main(String[] args) {
        int[][] shallowArray;
        int[][] deepArray;
        int[][] arr = {
                        {1,2},
                        {5,6},
                        {8,5}
        };

        System.out.println("-----Arr-----");
        printArray(arr);
        System.out.println("-------------");

        shallowArray = shallowCopy(arr);
        System.out.println("We change a value of shallowArray[0][0]");

        System.out.println("-----Arr-----");
        printArray(arr);
        System.out.println("-------------");
        System.out.println("---Shallow---");
        printArray(shallowArray);
        System.out.println("-------------");

        deepArray = deepCopy(arr);
        System.out.println("We change a value of deepArray[0][1]");

        System.out.println("-----Arr-----");
        printArray(arr);
        System.out.println("-------------");
        System.out.println("----Deep-----");
        printArray(deepArray);
        System.out.println("-------------");
    }

    /**
     * Shallow Copy Array Method.
     *
     * @param arr for a given Array
     * @return    a copy for a given Array
     */
    public static int[][] shallowCopy(int[][] arr) {
        int[][] shallowArray = Arrays.copyOf(arr, arr.length);

        shallowArray[0][0] = 8;

        return shallowArray;
    }

    /**
     * Deep Copy Array Method.
     *
     * @param arr for a given array
     * @return    a copy for a given Array
     */
    public static int[][] deepCopy(int[][] arr) {
        int[][] deepCopy = new int[arr.length][arr[0].length];

        for (int i = 0; i < deepCopy.length; i++) {
            for (int j = 0; j < deepCopy[i].length; j++) {
                deepCopy[i][j] = arr[i][j];
            }
        }

        deepCopy[0][1] = 8;

        return deepCopy;
    }

    /**
     * Prints an Array two dimensions.
     *
     * @param arr for a given Array
     */
    public static void printArray(int[][] arr) {
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
