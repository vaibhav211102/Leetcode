package Leetcode_Easy;

public class Easy_Problem_Sixty_Six {
    public static void main(String[] args) {

        int[] digits = {1,2,3};

        boolean carry = true;

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                carry = false;
                break;
            }

            digits[i] = 0;
        }

        if (carry) {

            int[] result = new int[digits.length + 1];

            result[0] = 1;

            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }

        } else {

            for (int i = 0; i < digits.length; i++) {
                System.out.print(digits[i] + " ");
            }
        }
    }
}