package Sorting;

import Services.DsaRunner;
import Sorting.Services.Impl.BubbleSort;
import Sorting.Services.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class PlayWithSorting implements DsaRunner {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new PlayWithSorting().run();
    }

    @Override
    public void run() {
        Sort sort = null;
        System.out.println("Enter the size of array to create: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int value;

        System.out.println("1. Bubble Sort\n2.Quick Sort\n3. Merge SOrt\nChoose the type of search (Note: Binary search expects the array to be sorted):");
        value = scanner.nextInt();
        if (value == 1) sort = new BubbleSort();
//        else search = new BinarySearch();

        System.out.println("Enter the values which needs to be entered in array: ");
        for (int i=0; i<size; i++) {
            System.out.print("--->");
            value = scanner.nextInt();
            array[i] = value;
        }

        array = sort.sort(array,false);
        Arrays.stream(array).forEach(i -> System.out.println("--->"+i));
    }
}
