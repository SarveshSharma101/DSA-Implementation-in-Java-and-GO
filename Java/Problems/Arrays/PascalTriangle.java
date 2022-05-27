package Problems.Arrays;

import java.util.Arrays;

public class PascalTriangle {

    /**
     *
     * Pascal's Triangle
     *
     * The triangle below is known as Pascal’s triangle.
     *
     * In this triangle, the value at a position is equal to the sum of values of the 2 elements just above it.
     *
     * Examples
     * The 2nd element of 5th row is 1+3 => 4
     * The 3rd element of 5th row is 3+3 => 6
     * The 4th element of 5th row is 3+1 => 4
     *
     * For the leftmost and the rightmost position in each row, the value is 1.
     * The element in the first row is also 1.
     *
     * Given a number n, find the nth row of pascal’s triangle.
     *
     * Input Format
     * The first line contains ‘T’ denoting the no. of test cases.
     *
     * Next T lines contains a number 'n' denoting the row number of pascal’s triangle.
     *
     * Output Format
     * For each test case, a line containing ‘n’ space-separated integers denoting the elements in the nth row.
     *
     */

    int factorial(int num){
        if (num==0) return 1;
        else return num*factorial(num-1);
    }
    int[] pascalTriangleRow(int rowNo) {
        int[] C = new int[rowNo];
        rowNo = rowNo-1;
        int fRow = factorial(rowNo);
        C[0]=1;
        for (int i=1; i<=rowNo; i++){
            C[i] = fRow/(factorial(rowNo-(i))*factorial(i));
        }
        return C;
    }

    public static void main(String[] args) {
        int[] C = new PascalTriangle().pascalTriangleRow(10);
        Arrays.stream(C).forEach(System.out::println);
    }
}
