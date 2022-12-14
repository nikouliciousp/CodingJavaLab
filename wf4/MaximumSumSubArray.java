package gr.aueb.cf.projects.wf4;

/**
 * This app finds the sum of the continuous sub Array within
 * an array with the maximum sum.
 *
 * @author Periklis Nikoulis
 */
public class MaximumSumSubArray {

    static int maxSumSubArray = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int[] arr = {-2, 3, -1, 2, 5};
        int[] resultsArray = maximumSumSubArray(arr);

        System.out.println("Maximum SubArray is: " + resultsArray[0] + " Starts: " + resultsArray[1] + " Ends: " + resultsArray[2]);
    }


    public static int[] maximumSumSubArray(int[] arr) {
        //returnedArray[0] = maxSumSubArray, returnedArray[1] = startsIndex, returnedArray[2] = endIndex
        int [] returnedArray = new int[3];
        int localMaxSumSubArray = 0;
        int pivot = 0;

        //
        for (int i = 0; i < arr.length; i++) {
            localMaxSumSubArray += arr[i];

            if (maxSumSubArray < localMaxSumSubArray) {
                maxSumSubArray = localMaxSumSubArray;
                returnedArray[1] = pivot;
                returnedArray[2] = i;
            }

            if (localMaxSumSubArray < 0) {
                localMaxSumSubArray = 0;
                pivot = i + 1;
            }
        }

        returnedArray[0] = maxSumSubArray;

        return returnedArray;
    }
}
