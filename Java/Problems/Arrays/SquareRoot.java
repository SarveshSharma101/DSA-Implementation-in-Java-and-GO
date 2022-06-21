package Problems.Arrays;

public class SquareRoot {

    /**
     * Square Root
     * Easy
     * 0 / 30
     * Given a non-negative integer 'n', compute and return the square root of 'n'.
     * If n is not a perfect square, return the floor of the result.
     *
     * Note: Do not use the in-built methods to calculate square root or power.
     *
     * Expected Time Complexity: O(log n)
     * @param num
     * @return
     */
    int searchRoot (int num) {
        // add your logic here
        int subCount=0;
        int temp = num;
        for (int i=1; i<num; i=i+2){

            temp = temp-i;
            subCount++;
            if (temp==0){
                return subCount;
            }
            else if (temp<0) {
                return subCount-1;
            }
        }
        return subCount;
    }

    public static void main(String[] args) {
        int num = 132;
        System.out.println(new SquareRoot().searchRoot(num));
        System.out.println(Math.sqrt(num));
        System.out.println(Math.floor(Math.sqrt(num)));
    }
}
