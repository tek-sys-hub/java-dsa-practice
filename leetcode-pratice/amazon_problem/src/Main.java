public class Main {

    // Q : Find Position of an element in a sorted array of infinite numbers ?
    // We can't use .length to find the length
    // Assuming we don't know the size of array

    public static void main(String[] args) {

        int[] arr = {1,5,9,10,15,41,65,88,89,90,92,95,96,102,202,333};
        int target = 15;

        int ans = range(target ,arr);

        System.out.println(ans);

    }
    static int range (int target , int[] arr) {
        // Find the range
        // Start with the box of size 2

        int start = 0;
        int end = 1;

        // Condition for the taget to lie in the chunk

        while (target > arr[end]) {
            // new start becomes
            int newStart = end + 1;
            // end becomes double the chunk size

            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return check(arr,target,start,end);
    }
    static int check (int[] arr, int target , int start , int end ) {
        while (start <= end) {
            int mid = start + (end - start) /2;

           if (arr[mid] == target){
               return mid;
           }else if (arr[mid] < target) {
               start = mid + 1;
           }else {
               end = mid - 1;
           }
        }

        return -1;
    }
}