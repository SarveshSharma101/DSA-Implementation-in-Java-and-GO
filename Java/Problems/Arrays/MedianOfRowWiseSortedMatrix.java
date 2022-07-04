package Problems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/**
 * Median of Row-wise Sorted Matrix
 * Medium
 * 50 / 50
 * Given an n*m matrix which is sorted row-wise, you need to find the median of the matrix.
 *
 * Median of a group of numbers is the middle element after they are sorted.
 * Both n and m are guaranteed to be odd numbers, therefore there’s only one middle number.
 *
 * Example
 * 1 2 3
 * 3 3 4
 * 1 1 2
 * Median: 2
 */

public class MedianOfRowWiseSortedMatrix {

    int calculateMedianOfMatrix(int[][] matrix){
        ArrayList<Integer> A = new ArrayList<>();

        for (int[] x: matrix) {
            Arrays.stream(x).forEach(A::add);
        }

        return sortAndGetMidElement(A);
    }

    private int sortAndGetMidElement(ArrayList<Integer> a) {
        Collections.sort(a);

        return a.get(a.size()/2);
    }

    public static void main(String[] args) {
        int[][] A = new int[][]{{1,2,3},{3,3,4},{1,1,2}};
        int[][] B = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] C = new int[][]{{1,6,7,7,8},{2,2,3,3,4},{1,2,2,2,2}};
        MedianOfRowWiseSortedMatrix medianOfRowWiseSortedMatrix  =
                new MedianOfRowWiseSortedMatrix();

        System.out.println(medianOfRowWiseSortedMatrix.calculateMedianOfMatrix(A));
        System.out.println(medianOfRowWiseSortedMatrix.calculateMedianOfMatrix(B));
        System.out.println(medianOfRowWiseSortedMatrix.calculateMedianOfMatrix(C));
    }
}
