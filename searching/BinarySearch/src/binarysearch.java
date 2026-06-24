public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {5,6,8,11,45,159}; // binary search only works in sorted array

        int target = 11;

        int ans = check(arr , target);

        System.out.println("Number is at the index of " + ans);
    }

    //If the element does not exist return -1
    static int check (int[] arr , int target) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
             //   int mid = (start + end) / 2;
            // For large values of (start + end) it may exceed the range of int

                int mid = start + (end - start) / 2;

                if (target == arr[mid]) {
                    // ans found
                    return mid;
                }else if (target < arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        return -1;
    }
}
