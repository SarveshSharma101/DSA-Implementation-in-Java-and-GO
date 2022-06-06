package Problems.Arrays;

public class InsertPositionInSortedArray {
    int getInsertPosition (int[] arr, int key) {
        // add your logic here
        int i=0;

        while(i< arr.length && arr[i]<key) i++;

        return i;
    }

    public static void main(String[] args) {
        int[] arr0 = new int[]{1, 2, 3, 4, 5};

        System.out.println(new InsertPositionInSortedArray().getInsertPosition(arr0, 3));

        int[] arr1 = new int[]{1, 2, 3, 5};

        System.out.println(new InsertPositionInSortedArray().getInsertPosition(arr1, 4));


        int[] arr2 = new int[]{1, 2, 3, 4, 5};

        System.out.println(new InsertPositionInSortedArray().getInsertPosition(arr2, -3));


        int[] arr3 = new int[]{1, 2, 3, 4, 5};

        System.out.println(new InsertPositionInSortedArray().getInsertPosition(arr3, 6));
    }
}
