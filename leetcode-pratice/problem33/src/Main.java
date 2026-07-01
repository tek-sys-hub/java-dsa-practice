public class Main {
    public static void main(String[] args) {
        //https://leetcode.com/problems/search-in-rotated-sorted-array/description/

        int[] arr = {4,5,6,7,0,1,2};
        int target = 4;

        System.out.println(search(arr, target));

    }

    static int search (int[] arr , int target) {

        int pivot = pivot(arr);

        if (pivot == -1) {
            // it means our array is never rotated
            // do normal binary search
           return binary(arr , target , 0 , arr.length - 1);
        }
        // if you find pivot then you found two ascending array

        if(target == arr[pivot]) {
            return pivot;
        } if (target >= arr[0]) {
            return binary(arr , target , 0 , pivot - 1);
        }
        return binary(arr , target , pivot + 1 , arr.length - 1);

    }

    static int binary (int[] arr , int target , int start , int end) {

        while (start <= end) {
            //   int mid = (start + end) / 2;
            // For large values of (start + end) it may exceed the range of int

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                // answer found
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int pivot (int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }  else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }else if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }

        }
                return -1;
    }

}