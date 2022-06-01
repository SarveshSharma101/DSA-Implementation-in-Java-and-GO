package Problems.Arrays;

public class NegativeNumbersInSortedArray {

    /**
     * Negative numbers in sorted array
     * Easy
     * 30 / 30
     * Given a sorted array of integers, find the number of negative numbers.
     *
     * Expected Time Complexity: O(log n)
     * @param arr
     * @return
     */
    int getNegativeNumbersCount (int[] arr) {
        // add your logic here

        int count = 0;
        for (int i: arr){
            if (i>=0){
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = new int[]{-5, -3, -2, 3, 4, 6, 7, 8};
        System.out.println(new NegativeNumbersInSortedArray().getNegativeNumbersCount(A));
    }
}
