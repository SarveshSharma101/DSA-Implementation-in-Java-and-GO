package Problems.Arrays;

public class MaximumKSubarraySum {

    /**
     * Maximum K-Subarray Sum
     * Easy
     * 30 / 30
     * Given an array and a number k,
     * find the sum of the subarray that has the maximum sum among all the subarrays of size k.
     * @param A
     * @param k
     * @return
     */
    int maxKSubarraySum (int[] A, int k) {
        // add your logic here
        int maxSum = 0, sum=0;
        for (int i=0; i<= A.length-k; i++){
            sum=0;
            for (int j=i; j<i+k; j++){
                sum+=A[j];
            }
            if (maxSum<sum){
                maxSum =sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaximumKSubarraySum maximumKSubarraySum = new MaximumKSubarraySum();
        int[] A = new int[]{3, 5, 6, 2, 4, 7, 8};
        int[] B = new int[]{1, 3, 3, 3, 4, 4};
        System.out.println(maximumKSubarraySum.maxKSubarraySum(A, 3));
        System.out.println(maximumKSubarraySum.maxKSubarraySum(B, 1));
    }
}
