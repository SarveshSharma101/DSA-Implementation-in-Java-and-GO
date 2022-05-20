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

    /**
     * Consider an array that is divided into two parts and both of the parts are sorted individually.
     * Given the mentioned array and the end index of the first part,
     * merge them to create a sorted array. Update the same array with the merged elements.
     * You can use extra auxiliary space.
     *
     * Expected Time Complexity: O(n) where n denotes the size of the array.
     *
     * Example
     * Array: [1, 3, 5, 7, 9, 11, 0, 4, 6, 8]
     * End Index: 5
     * Array after merging: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11]
     *
     * @param arr
     * @param endIndex
     */
    void merge (int[] arr, int endIndex) {
        int i = 0, k = 0;
        int j = endIndex+1;

        int[] C = new int[arr.length];
        while (i<=endIndex && j<arr.length){
            if (arr[i]<=arr[j]){
                C[k] = arr[i];
                k++;
                i++;
            }else {
                C[k] = arr[j];
                k++;
                j++;
            }
        }

        while (i<= endIndex){
            C[k] = arr[i];
            k++;
            i++;
        }

        while (j< arr.length){
            C[k] = arr[j];
            k++;
            j++;
        }

        for (int x=0; x< arr.length; x++){
            arr[x] = C[x];
        }
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 4};
        int[] B = new int[]{2, 4, 5, 5};

        int [] C = new Merge2SortedArrays().mergeSortedArrays(A,B);
        Arrays.stream(C).forEach(i -> System.out.println("--->"+i));

        int[] arr = new int[]{1, 3, 5, 7, 9, 11, 0, 4, 6, 8};

        new Merge2SortedArrays().merge(arr, 5);
        Arrays.stream(arr).forEach(i1 -> System.out.println("***---->"+i1));
    }
}
