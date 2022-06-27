package Problems.Arrays;

import Searching.Service.Impl.BinarySearch;

public class MatrixSearch {

    /**
     * Matrix Search
     * Medium
     * 50
     * Given a matrix, check if the matrix contains a given key.
     *
     * The matrix has the following properties:
     *
     * Integer in each row is arranged in non-decreasing order from left to right.
     * The first integer in every row is greater than the last integer of the previous row.
     * Expected Time Complexity: O(log (n*m))
     */

    boolean searchMatrix(int[][] matrix, int key){


        for (int i=0; i<matrix.length; i++){
            if (key> matrix[i][matrix[0].length-1]){
                continue;
            }else if (key<matrix[i][0]){
                return false;
            }else{
                return binarySearch(key, matrix[i]);
            }
        }

        return false;
    }

    private boolean binarySearch(int key, int[] matrix) {
        int low = 0;
        int high = matrix.length-1;
        int mid=0;
        while (low<high){
            if (matrix[low]==key) return true;
            else if (matrix[high]==key) {
                return true;
            }
            mid = (low+high)/2;
            if (matrix[mid]==key) return true;
            else if (matrix[mid]>key) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{10,13,15,17},{20,24,31,40},{41,44,45,48},{90,102,111,134}};

        System.out.println("13->"+new MatrixSearch().searchMatrix(matrix, 13));
        System.out.println("41->"+new MatrixSearch().searchMatrix(matrix, 41));
        System.out.println("9->"+new MatrixSearch().searchMatrix(matrix, 9));
        System.out.println("19->"+new MatrixSearch().searchMatrix(matrix, 19));
        System.out.println("103->"+new MatrixSearch().searchMatrix(matrix, 103));
        System.out.println("41->"+new MatrixSearch().searchMatrix(matrix, 41));
        System.out.println("134->"+new MatrixSearch().searchMatrix(matrix, 134));
        System.out.println("90->"+new MatrixSearch().searchMatrix(matrix, 90));
        System.out.println("91->"+new MatrixSearch().searchMatrix(matrix, 91));

    }
}
