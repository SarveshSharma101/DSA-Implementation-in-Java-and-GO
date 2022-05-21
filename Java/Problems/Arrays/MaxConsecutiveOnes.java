package Problems.Arrays;

public class MaxConsecutiveOnes {

    /**
     * Max Consecutive Ones
     * Given an array A, find the maximum number of consecutive 1s in the array.
     *
     * Examples
     * A: [1, 1, 3, 2, 3, 1, 1, 1]
     * Max consecutive 1s: 3
     * @param A
     * @return
     */

    int getMaxConsecutiveOnes(int[] A) {
        // add your logic here
        int maxCount = 0;
        int i = 0;
        int count=0;
        while (i<A.length){
            count=0;
            while ( i< A.length && A[i]==1){
                count = count+1;
                i++;
            }
            if (maxCount<count) maxCount = count;
            i = i+1;
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 1, 3, 2, 3, 1, 1, 1};
        System.out.println(new MaxConsecutiveOnes().getMaxConsecutiveOnes(A));
    }
}
