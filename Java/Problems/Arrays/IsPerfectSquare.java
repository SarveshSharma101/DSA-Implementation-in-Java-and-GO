package Problems.Arrays;

public class IsPerfectSquare {

    boolean isPerfectSquare (int num) {
        num = Math.abs(num);
        // add your logic here
        if (num == 0) return true;
        if (num == 4) return true;

        int low = 0;
        int high = num/2;;
        int mid;
        int temp;
        while (low<=high){
            mid = (low+high)/2;
            temp = mid*mid;
            if ( temp == num) return true;
            else if (temp>num) high = mid-1;
            else low = mid+1;
        }
        return  false;
    }

    public static void main(String[] args) {
        IsPerfectSquare isPerfectSquare = new IsPerfectSquare();

        System.out.println(isPerfectSquare.isPerfectSquare(25));
        System.out.println(isPerfectSquare.isPerfectSquare(81));
        System.out.println(isPerfectSquare.isPerfectSquare(121));
        System.out.println(isPerfectSquare.isPerfectSquare(4));
        System.out.println(isPerfectSquare.isPerfectSquare(5));
        System.out.println(isPerfectSquare.isPerfectSquare(79211));
    }
}
