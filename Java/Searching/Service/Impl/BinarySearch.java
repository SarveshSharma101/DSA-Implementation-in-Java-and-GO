package Searching.Service.Impl;

import Searching.Service.Search;

public class BinarySearch implements Search {

    @Override
    public int search(int[] array, int dataToSearch) {
        int low = 0;
        int high = array.length-1;

        while (low<high){
            if (check(low, dataToSearch, array)) return low;
            else if (check(high, dataToSearch, array)) return high;

            int mid = (low+high)/2;
            if (check(mid, dataToSearch, array)) return mid;

            if (dataToSearch>array[mid]) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }

    private boolean check(int index, int data, int[] array){
        return array[index] ==  data;
    }
}
