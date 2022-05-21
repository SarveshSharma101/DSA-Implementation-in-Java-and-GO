package Problems.Arrays;

import java.util.Arrays;

public class QuickSort {


    public void QuickSort(int[] arr, int low, int high){
        if (low<high){
            int p = partition(arr, low, high);
            QuickSort(arr, low, p-1);
            QuickSort(arr, p+1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int p = arr[high];
        int i=low;
        int j=high-1;

        while (true){
            while (arr[i]<p){ i++;}
            while (j>=0 && arr[j]>p){ j--;}
            if (i>=j) break;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[high] = arr[i];
        arr[i] = p;

        return i;
    }

    public static void main(String[] args) {
        int[] A = new int[]{5, 4, 2, 5, 3};
        new QuickSort().QuickSort(A, 0, A.length-1);
        Arrays.stream(A).forEach(i -> System.out.println("->"+i));
    }
}
