package Problems.Arrays;


/**
 * For an array of integers nums,
 * an identical twin is defined as pair (i, j) where nums[i] is equal to nums[j] and i < j.
 *
 * EXAMPLES:
 * Array: [1, 2, 3, 2, 1]
 * Number of Identical Twins: 2
 * Explanation:
 * Identical Twins: [[1, 1], [2, 2]]
 * Indexes: (0, 4), (1, 3)
 *
 *
 * Array: [1, 2, 2, 3, 2, 1]
 * Number of Identical Twins: 4
 * Explanation:
 * Identical Twins: [[1, 1], [2, 2], [2, 2], [2, 2]]
 * Indexes: (0, 5), (1, 2), (1, 4), (2, 4)
 *
 * Array: [1, 1, 1, 1]
 * Number of Identical Twins: 6
 * Explanation:
 * Identical Twins: [[1, 1], [1, 1], [1, 1], [1, 1], [1, 1], [1, 1]]
 * Indexes: (0, 1), (0, 2), (0, 3), (1, 2), (1, 3), (2, 3)
 */

public class IdenticalTwins {

    int getIdenticalTwinsCount (int[] arr) {
        int count = 0;

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j]) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 1};
        System.out.println(new IdenticalTwins().getIdenticalTwinsCount(arr));
    }
}
