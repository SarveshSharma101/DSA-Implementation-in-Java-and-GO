package Problems.Arrays;

public class ContainsElement {

    /**
     * Contains Element?
     * Easy
     * 30 / 30
     * Given a sorted array and a number key, return whether the key is present in the array or not.
     *
     * Expected Time Complexity: O(log n)
     * @param arr
     * @param key
     * @return
     */
    boolean containsElement (int[] arr, int key) {
        // add your logic here
        int l=0;
        int h=arr.length-1;
        while (l<=h){
            if (arr[l]==key) return true;
            else if(arr[h]==key) return true;
            else{
                int mid = (l+h)/2;
                if (arr[mid]==key) return true;
                else if (key>arr[mid]) l = mid+1;
                else h = mid-1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 3, 3, 4, 4, 5};
        System.out.println(new ContainsElement().containsElement(A, 0));
    }
}
