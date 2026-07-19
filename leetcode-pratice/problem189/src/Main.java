import java.util.Arrays;

// https://leetcode.com/problems/rotate-array/description/
public class Main {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int start = 0;
        int end = nums.length;

        int[] first = reverse(nums , start , end - 1);
        int[] second = reverse(nums , start , k - 1);
        int[] third = reverse(nums , k , end - 1);

        System.out.println("Final Rotated Array = " + Arrays.toString(third));

    }

    public static int[] reverse (int[] nums , int start , int end){

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        return nums;
    }



}