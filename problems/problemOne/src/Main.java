// Given an integer x, return true if x is a palindrome, and false otherwise.

// https://leetcode.com/problems/palindrome-number/description/

public class Main {
    public static void main(String[] args) {
        int num = 12;

        System.out.println(isPalindrome(num));
    }
    static String isPalindrome (int x) {
        int rem;
        int reverse = 0;
        int temp = x;
        while(temp > 0) {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        }
        if (reverse == x){
            return "Is Palindrome";
        }

        return "Not Palindrome";
    }
}