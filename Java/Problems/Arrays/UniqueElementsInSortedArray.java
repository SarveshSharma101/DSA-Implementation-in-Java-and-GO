package Problems.Arrays;

public class UniqueElementsInSortedArray {

    /**
     * Unique Elements in Sorted Array
     * Easy
     * 30 / 30
     * Given a sorted array A, find the size of array A after removing the duplicate elements.
     *
     * Examples:
     * A: [1 2 3 3 3 4 5 5]
     *
     * Size of A after removing duplicate elements: 5
     * @param A
     * @return
     */
    int removeDuplicates(int[] A) {
        // add logic here
        int count=0, x =0;
        for (int i=0; i< A.length; i++){

            x=A[i];
            while (i+1<A.length && A[i+1]==x){
                i++;
                A[i]=0;
                count++;
            }

        }
        return A.length-count;
    }


    public static void main(String[] args) {
        int[] A = new int[]{1,2,3,3,3,4,5,5};
        int[] B = new int[]{1,1,1,2,2,2};
        int[] C = new int[]{1,1,3,3,4,4,4};
        int[] D = new int[]{1,2,3,4,5};
        int[] E = new int[]{1,2,3,4,5,6,6,6};
        UniqueElementsInSortedArray uniqueElementsInSortedArray =
                new UniqueElementsInSortedArray();

        System.out.println("A"+uniqueElementsInSortedArray.removeDuplicates(A));
        System.out.println("---------------------------------------------------");
        System.out.println("B"+uniqueElementsInSortedArray.removeDuplicates(B));
        System.out.println("---------------------------------------------------");

        System.out.println("C"+uniqueElementsInSortedArray.removeDuplicates(C));
        System.out.println("---------------------------------------------------");

        System.out.println("D"+uniqueElementsInSortedArray.removeDuplicates(D));
        System.out.println("---------------------------------------------------");
        System.out.println("E"+uniqueElementsInSortedArray.removeDuplicates(E));
        System.out.println("---------------------------------------------------");
    }
}
