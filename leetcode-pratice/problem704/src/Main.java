public class Main {
    public static void main(String[] args) {
// https://leetcode.com/problems/binary-search/description/

        int[] nums = {-1,0,3,5,9,12};
        int target = 5;

        int index = search(nums , target);

        System.out.println(index);

    }
    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                return mid;
            }else if (nums[mid] < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}