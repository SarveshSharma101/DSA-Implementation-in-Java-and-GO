package Sorting.Services.Impl;

import Sorting.Services.Sort;

public class MergeSort implements Sort {
    @Override
    public int[] sort(int[] array, boolean desc) {
        mergeSort(array, 0, array.length-1);
        return array;
    }

    private void mergeSort(int[] array, int l, int h) {
        if(l<h){
            int mid = (l+h)/2;
            mergeSort(array, l, mid);
            mergeSort(array, mid+1, h);
            merge(array, l, mid, h);
        }
    }

    private void merge(int[] array, int l, int mid, int h) {
        int i = l;
        int k = l;
        int j = mid+1;
        int[] B = new int[100];

        while (i<=mid && j<=h){
            if (array[i]<array[j]){
                B[k] = array[i];
                k++;
                i++;
            }else {
                B[k] = array[j];
                k++;
                j++;
            }
        }

        while (i<=mid){
            B[k] = array[i];
            k++;
            i++;
        }

        while (j<=h){
            B[k] = array[j];
            k++;
            j++;
        }

        for (int x = l; x<=h; x++){
            array[x] = B[x];
        }
    }
}
