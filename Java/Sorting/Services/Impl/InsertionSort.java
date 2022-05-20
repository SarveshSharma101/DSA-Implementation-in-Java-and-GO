package Sorting.Services.Impl;

import Sorting.Services.Sort;

public class InsertionSort implements Sort {

    @Override
    public int[] sort(int[] array, boolean desc) {
        int key=0, j=0;
        for (int i=1;i<array.length; i++){
            key = array[i];
            j=i-1;
            while (j>=0&&key<=array[j]){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
        return array;
    }
}
