public class searchString {
    public static void main(String[] args) {

        String name = "Cherry";
        char target = 'e'; // Output will be present
        //char target = 'f';  output will be not present

        boolean result = check(name , target);

        if (result) {
            System.out.println("Target is present in the string..");
        }else {
            System.out.println("Target is not present in the string..");
        }

    }
    // Creating a function to check for the letter
    static boolean check (String name , char target){
        // Checking if the given string is empty or not
            if (name.isEmpty()){
                return false;
            }
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == target) {
                    return true;
                }
            }
        return false;
    }
}
