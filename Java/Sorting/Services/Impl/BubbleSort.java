package Sorting.Services.Impl;

import Sorting.Services.Sort;

public class BubbleSort implements Sort {

    @Override
    public int[] sort(int[] array, boolean desc) {

        for (int i=0; i< array.length; i++){
            for (int j=0; j<array.length-i-1; j++){
                if (DescCheck(array[j],array[j+1], desc)){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    private boolean DescCheck(int x, int y, boolean descFlag){
        if (descFlag) return  x<y;
        return x>y;
    }
}
