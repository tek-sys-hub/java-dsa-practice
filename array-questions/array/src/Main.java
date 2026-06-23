// https://leetcode.com/problems/two-sum/description/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5,6,4,7,1,2,3,6};
        int target = 10;

        int[] ans = twoSum(nums , target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum (int[] nums , int target) {
                if(nums.length == 0) {return new int[]{-1,-1};}

                for (int i = 0; i < nums.length; i++) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[i] + nums[2] == target) {
                            return new int[] {i , j};
                        }
                    }
                }
        return new int[]  {0,0};
    }
}