package Problems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RowColumnZero {

    /**
     * Row Column Zero
     *
     * Given a matrix, if any of the cells in the matrix is 0,
     * set all the elements in its row and column to 0.
     *
     * Examples
     * 1 1 1        1 0 1
     * 1 0 1   =>   0 0 0
     * 1 1 1        1 0 1
     *
     * 0 1 2        0 0 0
     * 3 4 5   =>   0 4 5
     * 1 2 3        0 2 3
     *
     * 0 1 0        0 0 0
     * 3 4 5   =>   0 4 0
     * 1 2 3        0 2 0
     *
     * 0 1 0        0 0 0
     * 3 0 5   =>   0 0 0
     * 1 2 3        0 0 0
     * @param matrix
     */
    void setRowColumnZeroes(int[][] matrix){
        List<int[]> list = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (matrix[i][j] == 0){
                    list.add(new int[]{i,j});
                }
            }
        }

        for (int[] x : list){
            System.out.println(x[0]);
            System.out.println(x[1]);
            for (int i=0; i<matrix[0].length; i++){
                matrix[x[0]][i]=0;
            }
            for (int i=0; i<matrix.length; i++){
                matrix[i][x[1]]=0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[2][2];
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
        new RowColumnZero().setRowColumnZeroes(m);
        System.out.println("-------------------------------------");
        for (int i=0; i< m.length; i++){
            for (int j=0; j<m[0].length; j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
