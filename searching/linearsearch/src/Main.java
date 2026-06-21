public class Main {
    public static void main(String[] args) {
        int[] arra = {15,16,1,2,4,5,8,9,11,25};
        int target = 10;
        // Now creating a variable and calling the funtion
        boolean ans = check(arra,target);
        if (ans){
            System.out.println("Number Is Found");
        }else {
            System.out.println("Number is not found");
        }
    }
    static boolean check (int[] arr,int target) {

        // Checking the given array is empty or not
        if (arr.length == 0) {
            return false;
        }
        // If its not empty then search the target element
        for (int i : arr) {
            //Search for the number in the array
            if (i == target) {
                return true;
            }
        }
        return false;
    }
}