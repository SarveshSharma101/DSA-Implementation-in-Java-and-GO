package Problems.Arrays;

/**
 * k-diff pairs
 * Medium
 * 50
 * Given a sorted array A of size n and a number k,
 * return the number of unique pairs which have a difference of k.
 *
 * |arr[i] - arr[j]| = k where i < j
 */
public class KDiffpairs {

    int kDiffPairs (int[] A, int k) {
        // add your logic here
        int count=0;
        int x = 0;
        for (int i=0; i< A.length; i++){
            if (x!=A[i]) {
                x = A[i];
                for (int j = i + 1; j < A.length; j++) {
                    if (Math.abs(x - A[j]) == k) {
                        count++;
                        break;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 3, 5, 7, 10};
        KDiffpairs kDiffpairs = new KDiffpairs();

        System.out.println(kDiffpairs.kDiffPairs(A, 2));
        System.out.println(kDiffpairs.kDiffPairs(A, 3));
        System.out.println(kDiffpairs.kDiffPairs(A, 1));
    }
}
