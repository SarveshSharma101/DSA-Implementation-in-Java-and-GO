package Problems.Arrays;

import java.util.Arrays;

public class Merge2SortedArrays {

    /**
     * Merge Two Sorted Arrays
     *
     * Given two sorted arrays A and B, find the merged sorted array C by merging A and B.
     *
     * Example:
     * A: [1, 2, 3, 4, 4]
     * B: [2, 4, 5, 5]
     * C: [1, 2, 2, 3, 4, 4, 4, 5, 5]
     **/
    int[] mergeSortedArrays(int[] A, int[] B) {
        int k=0,i=0,j=0;
        int[] C = new int[A.length+B.length];
        while (i<A.length && j<B.length){
            if (A[i]<=B[j]){
                C[k] = A[i];
                k++;
                i++;
            }else {
                C[k] = B[j];
                k++;
                j++;
            }
        }

        while (i< A.length){
            C[k] = A[i];
            k++;
            i++;
        }

        while (j< B.length){
            C[k] = B[j];
            k++;
            j++;
        }
        return C;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 4};
        int[] B = new int[]{2, 4, 5, 5};

        int [] C = new Merge2SortedArrays().mergeSortedArrays(A,B);
        Arrays.stream(C).forEach(i -> System.out.println("--->"+i));
    }
}
