package Problems.Arrays;

public class RemoveOccurences {

    int removeOccurences(int[] A, int k) {
        // add your logic here
        int count=0;
        for(int i=0; i< A.length; i++){
            if (A[i]==k){
                A[i]=-1;
                count++;
            }
        }
        return A.length-count;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 4, 2, 6, 2, 6, 9, 4};
        System.out.println(new RemoveOccurences().removeOccurences(A, 6));
    }
}
