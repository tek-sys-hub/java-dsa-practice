public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        int target = 9;
        System.out.println(search(arr,target));
    }
    // Create a function to search the value
    static int search (int[] arr , int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid;

        if (target > arr[arr.length - 1]) {
            return -1;
        }
        while (start <= end) {
            mid = start + (end - start);
            // Check if the middle value is equal to the target
            if (arr[mid] == target) {
                return mid;
            }else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
}