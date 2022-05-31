package Problems.Arrays;

import java.util.Arrays;

public class QuickSelect {

    /**
     * Kth Largest Element
     *
     * Given a list of numbers below:
     * 4, 3, 6, 4, 1
     *
     * What is the largest element in the list? → 6
     *
     * What is the 3rd largest element in the list? → 4
     *
     * Given a list of numbers, find the kth largest element in the list.
     *
     * A simple solution is to sort the array and get the kth largest element.
     * The best sorting algorithms have an average case time complexity of O(n log n).
     *
     * Try to solve this problem with an average time complexity of O(n).
     * Hint: Quickselect
     * @param A
     * @param k
     * @param low
     * @param high
     * @return
     */

    int quickSelect(int[] A,int k, int low, int high){
        int pivot = partitionArray(A, low, high);
        if (pivot==k-1){
            return A[pivot];
        }else if (pivot<k-1) return quickSelect(A, k, pivot+1, high);
        else return quickSelect(A, k, low, pivot-1);
    }

    private int partitionArray(int[] a, int low, int high) {
        int pivotElement = a[high];
        int i=low;
        int j=high-1;

        while (true){
            while (a[i]>pivotElement) i++;
            while (j>=0 && a[j]<pivotElement) j--;
            if (i>=j) break;
            swap(a, i, j);
        }
        swap(a, i, high);
        return i;
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String[] args) {
        int[] A = new int[]{4, 3, 2, 1};
        System.out.println(new QuickSelect().quickSelect(A,2,0, A.length-1));
        System.out.println("-----------------------------------------------------------");
        int[] B = new int[]{1,2,3,4,5};
        System.out.println(new QuickSelect().quickSelect(B,1,0, B.length-1));
        System.out.println("-----------------------------------------------------------");
    }
}