package Problems.Arrays;

import java.util.Arrays;

/**
 * K-Subarray Sum
 * Easy
 * 30 / 30
 * Given an array and a number k, find the sum of all the subarrays of size k.
 */

public class KSubarraySum {

    int[] kSubarraySum (int[] A, int k) {
        // add your logic here
        int[] count = new int[A.length-k+1];
        int sum=0;
        for(int i=0; i<=A.length-k; i++){
            sum=0;
            for (int j=i; j<k+i; j++){
                sum += A[j];
            }
            count[i] = sum;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] A = new int[]{3, 5, 6, 2, 4, 7, 8};
        int[] B = new int[]{1, 3, 3, 3, 4, 4};

        KSubarraySum kSubarraySum = new KSubarraySum();
        int[] cA = kSubarraySum.kSubarraySum(A,3);
        Arrays.stream(cA).forEach(System.out::println);

        int[] cB = kSubarraySum.kSubarraySum(B,1);
        Arrays.stream(cB).forEach(System.out::println);
    }
}
