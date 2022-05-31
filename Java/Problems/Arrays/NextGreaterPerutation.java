package Problems.Arrays;

import java.util.Arrays;

public class NextGreaterPerutation {

    /**
     * Next Greater Permutation
     *
     * Given an array, rearrange it to its next greater permutation.
     * Do it in-place with extra constant memory only.
     * Do not use any library function for the next permutation.
     */

    private boolean checkDesc(int[] arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i]<arr[i+1]) return false;
        }
        return true;
    }

    private boolean checkAsec(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            if (arr[i]>=arr[i+1]) return false;
        }
        return true;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void sort(int[] arr, int low, int high){
        int key=0, j=0;
        for (int i=low+1; i< high; i++){
            key = arr[i];
            j = i-1;
            while (j>=low && arr[j]>=key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    void nextGreaterPermutation (int[] arr) {
        if (checkAsec(arr)) {
            if (arr.length==1) return;
            swap(arr, arr.length-1, arr.length-2);
            return;
        }else{
            for (int i=arr.length-2; i>=0; i--){
                if (arr[i]<arr[i+1]){
                    swap(arr, i, arr.length-1);
                    sort(arr, i+1, arr.length);
                    return;
                }
            }
        }

        sort(arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] a = new int[]{4};
        new NextGreaterPerutation().nextGreaterPermutation(a);
        Arrays.stream(a).forEach(System.out::println);
    }
}
