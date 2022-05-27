package Problems.Arrays;

import java.util.Scanner;

public class Rotate90Degree {

    /**
     *
     * Matrix Rotation
     *
     * Given a matrix, rotate the matrix 90 degrees clockwise.
     * @param matrix
     *
     * Examples
     * Matrix:
     * 1 2 3
     * 4 5 6
     * 7 8 9
     * After rotation:
     * 7 4 1
     * 8 5 2
     * 9 6 3
     * Matrix:
     * 1 2
     * 3 4
     * 5 6
     * After rotation:
     * 5 3 1
     * 6 4 2
     *
     *
     * @return
     */

    int[][] rotateMatrix(int[][] matrix){
        int[][] C = new int[matrix[0].length][matrix.length];
        int size= matrix.length;
        for (int i=0; i<matrix.length; i++){
            size = size-1;
            for (int j=0; j<matrix[0].length;j++){
                C[j][size] = matrix[i][j];
            }
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][2];
        for (int i=0; i< m.length; i++){
            for (int j=0; j<m[0].length; j++){
                System.out.print("-->");
                m[i][j] = sc.nextInt();
                System.out.println();
            }
        }
        for (int i=0; i< m.length; i++){
            for (int j=0; j<m[0].length; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        int[][]C = new Rotate90Degree().rotateMatrix(m);
        System.out.println("--------------------------------------");

        for (int i=0; i< C.length; i++){
            for (int j=0; j<C[0].length; j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
