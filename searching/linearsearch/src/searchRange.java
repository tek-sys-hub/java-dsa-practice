public class searchRange {
    public static void main(String[] args) {

        int[] arr ={1,55,66,77,14,125,456,54};
        int target =66;
        int start = 1;
        int end = 3;

        boolean result = check(arr,target,start,end);

        if (result){
            System.out.println("Number is present in the range of" + " " + start + " to" + " " + end);
        }else {
            System.out.println("Number isnot present in the range of" + " " + start + " to" + " " + end);
        }

    }
    static boolean check (int[] arr , int target,int start, int end){
        // Checking if the given array is empty or not
        if (arr.length == 0){
            return false;
        }
        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
