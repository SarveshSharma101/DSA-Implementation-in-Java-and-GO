package Problems.Arrays;

public class InversionCount {

    int getInversionCount(int[] array) {
        int count=0;

        for (int i=0; i<array.length; i++){
            for (int j = i+1; j<array.length; j++){
                if (array[i]>array[j]) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = new int[]{10,1,2,3,4};
        System.out.println(new InversionCount().getInversionCount(a));
    }
}
