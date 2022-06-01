package Problems.Arrays;

import java.util.Arrays;

public class SearchRange {

    /**
     * Search Range
     * Easy
     * 0 / 30
     * Given a sorted array and a number key, find the index of the first and last occurrence of the key in the array.
     *
     * If the key is not present, return [-1, -1].
     *
     * Expected Time Complexity: O(log n)
     * @param arr
     * @param key
     * @return
     */
    int[] searchRange (int[] arr, int key) {
        // add your logic here
        int[] C = new int[2];
        boolean flag=false;
        for (int i=0; i< arr.length; i++){
            if (arr[i]==key){
                flag = true;
                for (int j=i+1; j<=arr.length; j++){
                    if (j>=arr.length){
                        C[0]=i;
                        C[1]=j-1;
                        break;
                    }
                    if (arr[j]>key){
                        C[0]=i;
                        C[1]=j-1;
                        break;
                    }
                }
                break;
            }
        }
        if (!flag){
            C[0]=-1;
            C[1]=-1;
        }
        return C;
    }


    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 3, 3, 4, 4, 5};

        int[] C = new SearchRange().searchRange(A, 5);
        Arrays.stream(C).forEach(System.out::println);
    }
}
