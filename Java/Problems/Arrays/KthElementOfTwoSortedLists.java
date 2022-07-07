package Problems.Arrays;

public class KthElementOfTwoSortedLists     {

    /**
     * Kth element of two sorted lists
     * Medium
     * 50
     * Given two sorted arrays A and B, and another value k,
     * print the kth element of the resultant sorted array.
     *
     * Example
     * A: [1, 2, 3, 4, 5, 6]
     * B: [3, 4, 4, 5, 6, 6]
     * Result: [1, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6]
     * 3rd element in the array is 3.
     * 6th element in the array is 4.
     * @param firstArr
     * @param secondArr
     * @param k
     * @return
     */
    int getKthElement(int[] firstArr, int[] secondArr, int k) {
        // add logic here
        int i = 0, j=0, l=0;
        k = k-1;
        while (i<firstArr.length && j<secondArr.length){
            if (firstArr[i]<secondArr[j]){
                if (l==k){
                    return firstArr[i];
                }
                l++;
                i++;
            }else {
                if (l==k){
                    return secondArr[j];
                }
                l++;
                j++;
            }
        }

        if (i==firstArr.length){
            return secondArr[k];
        }else {
            return firstArr[k];
        }
    }

    public static void main(String[] args) {
        int [] A = new int[]{1, 2, 3, 4};
        int[] B = new int[]{2,3,4,5};

        System.out.println(new KthElementOfTwoSortedLists().getKthElement(A,B,3));
    }
}
