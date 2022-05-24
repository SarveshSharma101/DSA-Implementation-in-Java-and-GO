package Problems.Arrays;

import java.util.Arrays;

public class LargestContiguousSum {

    /**
     *
     * Largest Contiguous Sum
     * A subarray is a part of an array including one or more contiguous/adjacent elements.
     *
     * Example
     * Array: [1, 2, 3, 4, 5]
     * Subarrays:
     * [1]
     * [2]
     * [3]
     * [4]
     * [5]
     * [1, 2]
     * [2, 3]
     * [3, 4]
     * [4, 5]
     * [1, 2, 3]
     * [2, 3, 4]
     * [3, 4, 5]
     * [1, 2, 3, 4]
     * [2, 3, 4, 5]
     * [1, 2, 3, 4, 5]
     * @param arr
     * @return
     */
    int largestContiguousSum(int[] arr){
        int maxSum=0;
        int sum;
        for (int i=0; i<arr.length; i++){
            sum = 0;
            for (int j=i; j<arr.length; j++){
                sum += arr[j];
                if (maxSum<sum) maxSum = sum;
            }
        }
        return  maxSum;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 5};
        System.out.println(new LargestContiguousSum().largestContiguousSum(A));
        System.out.println("----------------------------------------------------");
        int[] B = new int[]{4 ,-6 ,2 ,5};
        System.out.println(new LargestContiguousSum().largestContiguousSum(B));
        System.out.println("----------------------------------------------------");
        int[] C = new int[]{-6, -4, 2, 5};
        System.out.println(new LargestContiguousSum().largestContiguousSum(C));
        System.out.println("----------------------------------------------------");
        int[] D = new int[]{6, -4, 2, 5};
        System.out.println(new LargestContiguousSum().largestContiguousSum(D));
        System.out.println("----------------------------------------------------");
    }
}
