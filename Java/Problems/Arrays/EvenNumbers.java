package Problems.Arrays;

import java.util.ArrayList;
import java.util.List;


/***
 * Given an array of integers, find the elements which have an even number of digits.
 *
 * Array: [42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442]
 * Answer: 42, 5775, 34, 45, 3556
 *
 * The order of the returned elements should be the same as the order of the initial array.
 */

public class EvenNumbers {

    List<Integer> getEvenDigitNumbers (int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for (int value: arr ) {
            int digits = countDigits(value);
            if (digits%2 == 0) list.add(value);
        }
        return list;
    }

    int countDigits(int value){
        int count=1;
        while (value/10!=0){
            value = value/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442};

        System.out.println(new EvenNumbers().getEvenDigitNumbers(arr));


    }
}
