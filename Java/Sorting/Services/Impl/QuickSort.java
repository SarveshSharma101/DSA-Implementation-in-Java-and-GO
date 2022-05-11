package Sorting.Services.Impl;

import Sorting.Services.Sort;

public class QuickSort implements Sort {

    private int[] array;

    private int partition(int low, int high){
        int pivot = this.array[high];
        int i = low;
        int j = high-1;

        while (true) {
            while (this.array[i] < pivot) {
                i++;
            }
            while (j>=0 && this.array[j] > pivot) {
                j--;
            }
            if(i>=j)
                break;
            swap(i,j);
        }
        swap(i, high);
        return i;
    }

    private void swap(int i, int j) {
        int temp = this.array[i];
        this.array[i] = this.array[j];
        this.array[j] = temp;
    }

    private void QuickSort(int low, int high){
        if (low<high) {
            int p = partition(low, high);
            QuickSort(low, p - 1);
            QuickSort(p + 1, high);
        }
    }

    @Override
    public int[] sort(int[] array, boolean desc) {
        this.array = array;
        QuickSort(0, this.array.length-1);
        return this.array;
    }
}
