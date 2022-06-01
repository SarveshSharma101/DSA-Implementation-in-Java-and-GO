package Problems.Arrays;

public class NextGreaterElementInSortedArray {

    int getNextGreaterElement (int[] arr, int key) {
        // add your logic here
        int C = key;
        if (key>=arr[arr.length-1]) return C;
        for (int i=0; i< arr.length; i++){

            if (arr[i]>key){
                C = arr[i];
                break;
            }
        }
        return C;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 3, 4, 4, 8, 10};
        System.out.println(new NextGreaterElementInSortedArray().getNextGreaterElement(A, 8));
    }
}
