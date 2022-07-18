package Problems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * k-Substring Vowels
 * Medium
 * 0 / 50
 * Given a string s and a number k, find the number of vowels in every substring of size k.
 *
 * Vowels: ['a', 'e', 'i', 'o', 'u']
 */
public class KSubstringVowels {

    int[] kSubstringVowels (String s, int k) {
        // add your logic here
        List<Integer> list = new ArrayList<>();
        char[] c = s.toCharArray();
        int count;
        for (int i=0; i<=c.length-k; i++){
            count=0;
            for (int j=i; j<i+k; j++){
//                System.out.println("->before"+c[j]);
                switch (c[j]){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u': {
                        count++;
                        break;
                    }
                }
            }
            list.add(count);
        }
        return list.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        KSubstringVowels kSubstringVowels = new KSubstringVowels();

        Arrays.stream(kSubstringVowels.kSubstringVowels("workattech", 3))
                .forEach(i -> System.out.println(i));

    }
}
