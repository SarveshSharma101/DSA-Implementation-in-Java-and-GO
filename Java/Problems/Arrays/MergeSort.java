package Problems.Arrays;

import java.util.Arrays;

public class MergeSort {

    void merge (int[] arr, int low, int mid,int high) {
        int i = low, k = low;
        int j = mid+1;

        int[] C = new int[arr.length+1];
        while (i<=mid && j<=high){
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

        while (i<= mid){
            C[k] = arr[i];
            k++;
            i++;
        }

        while (j<= high){
            C[k] = arr[j];
            k++;
            j++;
        }

        for (int x=low; x<= high; x++){
            arr[x] = C[x];
        }
    }

    void mergeSort(int[] arr, int low, int high){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            if (arr[mid] > arr[mid + 1]){
                merge(arr, low, mid, high);
            }
        }
    }

    public static void main(String[] args) {
        int[] A = new int[]{5, 4, 2, 5, 3, 1};
        new MergeSort().mergeSort(A, 0, A.length-1);
        Arrays.stream(A).forEach(i -> System.out.println("-"+i));
    }
}
