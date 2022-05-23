package Problems.Arrays;

import java.util.Arrays;

public class ArithmeticSeq {

    /**
     * Arithmetic Sequence
     *
     * An Arithmetic progression (AP) or arithmetic sequence is a sequence of numbers such that
     * the difference between the consecutive terms is constant.
     * For instance, the sequence 5, 7, 9, 11, 13, 15, . . .
     * is an arithmetic progression with a common difference of 2.
     *
     * Given an unsorted array, find if it can be reordered to form an arithmetic sequence.
     * @param arr
     */

    public void sort(int[] arr){
        int key=0, j=0;
        for (int i=1; i<arr.length;i++){
            key = arr[i];
            j=i-1;
            while (j>=0 && arr[j]>=key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    boolean isArithmeticSequence (int[] arr) {
        sort(arr);
        int x = arr[0];
        int dif = arr[0]-arr[1];

        for (int i=2; i<arr.length;i++){
            if (dif == 0 && !(x-arr[i]==0)) return false;
            else if (dif!=0 && !(Math.abs(x-arr[i]) == Math.abs(i*dif))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] A = new int[]{9, 13, 5, 15, 7, 11};
        System.out.println(new ArithmeticSeq().isArithmeticSequence(A));
    }
}
