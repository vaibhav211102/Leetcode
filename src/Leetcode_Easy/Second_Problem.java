package Leetcode_Easy;
import java.util.Scanner;
public class Second_Problem {
    public static boolean isPalindrome(int x){
        int remainder = 0;
        int palindrome = 0;

        int temp = x;

        if (x < 0) {
            return false;
        }

        while (x != 0){
            remainder = x % 10;
            palindrome = (palindrome * 10) + remainder;
            x = x / 10;
        }

        if (temp == palindrome) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        boolean result = isPalindrome(num);

        if (result == true) {
            System.out.println("The is palindrome");
        }else {
            System.out.println("The is not palindrome");
        }
    }
}
