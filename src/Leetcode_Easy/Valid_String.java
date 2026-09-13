package Leetcode_Easy;
import java.util.*;
public class Valid_String {

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        boolean valid = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()){
                    valid = false;
                    break;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {

                    valid = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()){
            valid = false;
        }

        if (valid){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brackets: ");
        String str = sc.nextLine();
        boolean result = isValid(str);

        if (result) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }
    }
}
