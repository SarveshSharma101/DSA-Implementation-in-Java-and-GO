package Problems.Arrays;

public class NextGreaterElementInSortedArray {


    /**
     * Next Greater Element In Sorted Array
     * Easy
     * 30 / 30
     * Given a sorted array and a number key,
     * find the smallest array element which is greater than the key.
     *
     * If the key is greater than or equal to the largest element then return the key itself.
     *
     * Expected Time Complexity: O(log n)
     * @param arr
     * @param key
     * @return
     */

    int getNextGreaterElement (int[] arr, int key) {
        int C = key;
        if (key>=arr[arr.length-1]) return C;
        for (int i=0; i< arr.length; i++){

            if (arr[i]>key){
                C = arr[i];
                break;
            }
        }
        return C;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 3, 4, 4, 8, 10};
        System.out.println(new NextGreaterElementInSortedArray().getNextGreaterElement(A, 8));
    }
}
