package Problems.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SortedArraysIntersection {

    /**
     * Sorted Arrays Intersection
     * Easy
     * 0 / 30
     * Given 2 sorted arrays, return the intersection of both the arrays.
     * The intersection of 2 arrays means all the elements which are present in both.
     * @param A
     * @param B
     * @return
     */
    List<Integer> intersection (int[] A, int[] B) {
        // add your logic here
        List<Integer> l = new ArrayList<>();
        int[] lA = A.length>B.length? A:B;
        int[] sA = A.length<B.length? A:B;
        for (int i: sA ) {
            if (binarySearch(lA, i)){
                l.add(i);
            }
        }

        return l;
    }

    private boolean binarySearch(int[] a, int x){
        int l = 0, h = a.length-1, mid=0;
        while (l<h){
            if (a[l]==x){
                return true;
            } else if (a[h]==x) {
                return true;
            }else {
                mid = (l+h)/2;
                if (a[mid]==x){
                    return true;
                }else if (a[mid]<x){
                    l=mid+1;
                }else {
                    h=mid-1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 3, 4, 5, 5, 6, 6, 7};
        int[] B = new int[]{2, 5, 6, 6, 7, 8};

        List<Integer> l = new SortedArraysIntersection().intersection(A,B);
        l.stream().forEach(i -> System.out.println(i));
    }
}
