package Problems.Arrays;

public class TwoSumSorted {

    boolean hasTwoSumZero (int[] A) {
        // add your logic here
        int key = 0, index=0;
        for(int i=0; i<A.length; i++){
            key = A[i];
            index = binarySearch(A, i+1, A.length-1, key);
            if (index!=-1 && (A[index]+key)==0){
                return true;
            }
        }

        return false;
    }

    private int binarySearch(int[] A, int low, int high, int key){
        key = Math.abs(key);
        int index = -1, mid=0;

        while(low<high){
            if (A[low]==key){

                index = low;
                break;
            }
            else if (A[high]==key){

                index = high;
                break;
            }
            mid = (low+high)/2;
            System.out.println("------>"+ mid);
            if (A[mid]==key){

                index = mid;
                break;
            } else if (A[mid]>key) {
                high= mid-1;
            }else {
                low=mid+1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] A = new int[]{-3, 1, 3, 4};
        int[] B = new int[]{-2, 1, 3, 4};
        TwoSumSorted twoSumSorted = new TwoSumSorted();
        System.out.println(twoSumSorted.hasTwoSumZero(A));
        System.out.println(twoSumSorted.hasTwoSumZero(B));
    }
}
