package Searching;

import Searching.Service.Impl.BinarySearch;
import Searching.Service.Impl.linearSearch;
import Searching.Service.Search;
import Services.DsaRunner;

import java.util.Scanner;

public class PlayWithSearch implements DsaRunner {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new PlayWithSearch().run();
    }

    @Override
    public void run() {
        Search search;

        System.out.println("Enter the size of array to create: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int value;

        System.out.println("1. Linear Search\n2.Binary Search\nChoose the type of search (Note: Binary search expects the array to be sorted):");
        value = scanner.nextInt();
        if (value == 1) search = new linearSearch();
        else search = new BinarySearch();

        System.out.println("Enter the values which needs to be entered in array: ");
        for (int i=0; i<size; i++) {
            System.out.print("--->");
            value = scanner.nextInt();
            array[i] = value;
        }

        System.out.println("Enter the value you want to search inside the array: ");
        value = scanner.nextInt();
        int index = search.search(array,value);
        if (index==-1){
            System.out.println("Data not found");
        }else {
            System.out.println("Data found at index: "+ index);
        }
    }
}
