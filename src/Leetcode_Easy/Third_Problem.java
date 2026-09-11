package Leetcode_Easy;
import java.util.Scanner;
public class Third_Problem {
    public static int getVal(char ch){
        switch (ch){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }

    public static int romanToInt(String s){
        int n = s.length();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if ((i + 1 < n) && (getVal(c) < getVal(s.charAt(i+1)))) {
                sum = sum - getVal(c);
            }else {
                sum = sum + getVal(c);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in Roman : ");
        String s = sc.nextLine();

        int result = romanToInt(s);

        System.out.println();
        System.out.println("Roman to Integer : " + result);
    }
}
