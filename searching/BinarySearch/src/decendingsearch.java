// this will search given number in the decending sorted array..

public class decendingsearch {
    static void main(String[] args) {
        int[] arr = {159,145,140,120,115,95,90,58,45,25,5,0,-1,-2,-3}; // binary search only works in sorted array

        int target = 140;// Prints the index
        // int target = -9; // prints -1 which means value does not exist

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
                // answer found
                return mid;
            }else if (target > arr[mid]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
