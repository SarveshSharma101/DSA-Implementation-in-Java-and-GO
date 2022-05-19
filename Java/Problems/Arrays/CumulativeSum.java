package Problems.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * The cumulative sum of an array at index i is defined as
 * the sum of all elements of the array from index 0 to index i.
 *
 * EXAMPLE:
 * Initial Array: [1, 2, 3, 4]
 * Cumulative Sum: [1, 3, 6, 10]
 *
 * Initial Array: [1, 1, 1, 1, 1]
 * Cumulative Sum: [1, 2, 3, 4, 5]
 *
 * Initial Array: [1, 3, 5, 7, 9]
 * Cumulative Sum: [1, 4, 9, 16, 25]
 *
 * The first line contains 'T' denoting the no. of test cases.
 *
 * Input Format
 * Next T lines each contain a number 'n' denoting the number of elements,
 * followed by n The first line contains 'T' denoting the no. of test cases.
 *
 *
 * Output Format
 * T lines each contain n numbers denoting the cumulative sum of the respective indices.
 */

public class CumulativeSum {


    int[] getCumulativeSum (int[] arr) {
        int sum = 0;
        int[] b = new int[arr.length];
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<=i; j++){ sum += arr[j]; }
            b[i] = sum;
            sum=0;
        }
        return b;
    }


    /**
     * The positive cumulative sum of an array is a list of only those cumulative sums which are positive.
     *
     * EXAMPLES:
     *
     * Initial Array: [1, -2, 3, 4, -6]
     * Cumulative Sum: [1, -1, 2, 6, 0]
     * Positive Cumulative Sum: [1, 2, 6]
     *
     * Initial Array: [1, -1, -1, -1, 1]
     * Cumulative Sum: [1, 0, -1, -2, -1]
     * Positive Cumulative Sum: [1]
     *
     * Initial Array: [1, 3, 5, 7]
     * Cumulative Sum: [1, 4, 9, 16]
     * Positive Cumulative Sum: [1, 4, 9, 16]
     *
     *
     * @param arr
     * @return
     *
     *
     */
    List<Integer> getPositiveCumulativeSum (int[] arr) {
        int[] b = getCumulativeSum(arr);
        List<Integer> list = Arrays.stream(b)
                .filter(i -> i > 0)
                .boxed()
                .collect(Collectors.toList());
        return list;
    }

    public static void main(String[] args) {
        CumulativeSum cumulativeSum = new CumulativeSum();
        int[] a = new int[]{1,2,3,4};
        a = cumulativeSum.getCumulativeSum(a);
        Arrays.stream(a).forEach(i -> System.out.println(i));

        int[] gpa = new int[]{1, -2, 3, 4, -6};

        List<Integer> list = cumulativeSum.getPositiveCumulativeSum(gpa);
        list.forEach(System.out::println);
    }
}
