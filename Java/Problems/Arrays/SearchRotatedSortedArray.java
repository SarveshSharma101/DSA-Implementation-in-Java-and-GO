package Problems.Arrays;

public class SearchRotatedSortedArray {

    /**
     * Search Rotated Sorted Array
     * Medium
     * 50 / 50
     * You are given a list of unique integers which are sorted but rotated at some pivot.
     * You are also given a target value and you have to find its index in the list.
     * If it is not present in the list, return -1.
     *
     * Example:
     * List: [4, 5, 6, 7, 1, 2, 3]
     * Target value: 6
     * Resultant index: 2
     * @param a
     * @param x
     * @return
     */
    public int linearSearch(int[] a, int x){
        int index=-1;
        for (int i=0;i<a.length;i++){
            if (a[i]==x) return i;
        }
        return index;
    }

    public static void main(String[] args) {
        int i = new SearchRotatedSortedArray().linearSearch(new int[]{4, 5, 6, 7, 1, 2, 3}, 6);
        System.out.println(i);
    }
}
