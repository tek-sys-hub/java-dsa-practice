public class Main {

    // Q : Assume you have infinite number of sortred array and you need to search in it ?

    public static void main(String[] args) {

        int[] arr = {1,3,5,8,9,44,46,47,49,50,52,59,62,68,72,78};
        int target = 9;

        System.out.println(check(arr , target));

    }
    static int check (int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
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