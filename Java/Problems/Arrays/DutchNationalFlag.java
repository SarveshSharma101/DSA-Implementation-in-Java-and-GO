package Problems.Arrays;

import java.util.Arrays;

/**
 * Dutch National Flag
 * Medium
 * 50 / 50
 * Sort an array A where each of the elements belong to the set: {0, 1, 2}.
 *
 * Expected Time Complexity: O(n)
 *
 * Try to solve it without storing the count of 0s, 1s and 2s.
 */
public class DutchNationalFlag {

    void sortTheArray (int[] A) {
        // add your logic here
        int max = getMax(A);

        int[] Count = new int[max+1];
        int j=0;
        for (int i: A){
            Count[i]++;
        }
        for (int i=0; i< Count.length; i++){
            if (Count[i]==0)
                continue;
            else{
                while(Count[i]!=0){
                    A[j] = i;
                    Count[i]--;
                    j++;
                }
            }
        }

    }

    private int getMax(int[] A){
        int max =0;
        for(int i: A){
            if (i>=max){
                max = i;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] A = new int[]{9,12,1,4,14,6,15,7,9,3,2,2};
        new DutchNationalFlag().sortTheArray(A);
        Arrays.stream(A).forEach(i-> System.out.println(i));
    }
}
