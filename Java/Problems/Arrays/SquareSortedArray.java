package Problems.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SquareSortedArray {


    /**
     * Given an array of numbers,
     * return an array that contains the squares of all the numbers in non-decreasing order.
     *
     * Square sorted array
     *
     * Example
     * Array: [6, -8, 3, -1, 4]
     * Answer: [1, 9, 16, 36, 64]
     * @param arr
     * @return
     */
    int[] getSquareSortedArray (int[] arr) {
        int[] C = new int[arr.length];
        // add your logic here

        for (int i=0; i<arr.length; i++){
            int v = arr[i]*arr[i];
            int j = i-1;

            while (j>=0 && C[j]>v){
                C[j+1] = C[j];
                j--;
            }
            C[j+1] = v;
        }


        return C;
    }

    public static void main(String[] args) {
        int[] A = new int[]{6, -8, 3, -1, 4};
        int[]C = new SquareSortedArray().getSquareSortedArray(A);
        Arrays.stream(C).forEach(System.out::println);
    }
}
