package Searching.Service.Impl;

import Searching.Service.Search;

public class linearSearch implements Search {

    @Override
    public int search(int[] array, int dataToSearch) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == dataToSearch) return i ;
        }
        return -1;
    }
}
