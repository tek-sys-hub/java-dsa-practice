import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = { 2 , 5 , 6 , 9 , 10};

        int[] ans = findGCD(nums);

        System.out.println(Arrays.toString(ans));

      int gcd = getAns(ans[0] , ans[1]);

        System.out.println(gcd);

    }

    public static int[] findGCD(int[] nums) {

        int large = nums[0];
        int small = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (small > nums[i]) {
                small = nums[i];
            }if (large < nums[i]){
                large = nums[i];
            }

        }
        return new int[] {small , large};

    }

    public static int getAns (int a , int b) {
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}