public class Main {
    public static void main(String[] args) {
        //  https://leetcode.com/problems/split-array-largest-sum/description/

       // int[] arr = {7,2,5,10,8};
        int[] arr = {1,2,3,4,5,6};
        int m = 3;

        System.out.println(splitArray(arr,m));

    }
    public static int splitArray (int[] arr , int m) {
        int start = 0;
        int end = 0;
        for (int j : arr) {
            start = Math.max(start, j);
            end += j;
        }
        // Binary Search
        while (start < end) {
            int mid = start + (end - start) / 2;
             // Calculate the pieces you can create with max sum
            int sum = 0;
            int pieces = 1;
            for (int nums : arr) {
                if (sum + nums > mid) {
                    sum = nums;
                    pieces ++;
                }else {
                    sum += nums;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            }else {
                end = mid;
            }

        }

        return end; // start == end
    }
}