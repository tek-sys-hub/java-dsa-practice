public class minimumSearch {
    public static void main(String[] args) {

        int[] arr ={4,5,8,7,2,66,99,55,25,35,14,25,35,65,95,85,47,57,58,25};

        int ans = check(arr); // Store the ans returned from the check function
        System.out.println("Smallest Number In The Array Is " + " " + ans);
    }
    // Create a function that compares the number of array
    static int check (int[] arr) {
            // Check if the string is empty or not
        if (arr.length == 0) {
            return 0;
        }
        // Now comparing
        int num1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(num1 > arr[i]) {
                num1 = arr[i]; // When ever it finds the lesser value than the previous it swap
            }
        }
        return num1; // Return the ans
    }
}
