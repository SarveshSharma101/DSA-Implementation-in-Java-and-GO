package Problems.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MaximumkSubstringVowels {

    int maxKSubstringVowels (String s, int k) {
        // add your logic here
        // add your logic here
        List<Integer> list = new ArrayList<>();
        char[] c = s.toCharArray();
        int count, maxcount=0;
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
            if (maxcount<count){
                maxcount = count;
            }
        }
        return maxcount;
    }

    public static void main(String[] args) {
        MaximumkSubstringVowels maximumkSubstringVowels = new MaximumkSubstringVowels();

        System.out.println(maximumkSubstringVowels.maxKSubstringVowels("workaattech",3));
    }
}
