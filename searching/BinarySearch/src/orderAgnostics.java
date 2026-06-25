public class orderAgnostics {
    static void main(String[] args) {

        int[] desc_arr = {159,145,140,120,115,95,90,58,45,25,5,0,-1,-2,-3};
        int[] asc_arr = {-2, -1, 0, 5, 6, 8, 11, 45, 159};
        int target = 120;
        int target1 = -1;
       int ans = search(desc_arr , target);
        System.out.println("The "+ target + " is at index = " +ans);
        int ans1 = search(asc_arr , target1);
        System.out.println("The "+ target1 + " is at index = " +ans1);
    }

    static boolean check (int[] arr) {
        int start = 0;
        int last = arr.length - 1;
        return arr[start] < arr[last];
    }
    // Here true means its ascending
    // and false means its descending

    static int search (int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isasc = check(arr);

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isasc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

}
