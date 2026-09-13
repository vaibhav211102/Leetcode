package Leetcode_Easy;
import java.util.Scanner;
public class Longest_Common_String {
    public static String common(String s1 , String s2){
        int n = Math.min(s1.length(),s2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                sb.append(s1.charAt(i));
            }
            else {
                break;
            }
        }
        return sb.toString();
    }

    public static String longestCommonPrefix(String[] strs) {
        String res = strs[0];

        for(int i = 0; i < strs.length ; i++){
            res = common(res,strs[i]);
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        String[] stra = new String[size];

        System.out.println();
        System.out.println("Enter the array element : ");

        for (int i = 0; i < size; i++) {
            stra[i] = sc.next();
        }

        System.out.println("Your String Array:");

        for (int i = 0; i < stra.length; i++) {
            System.out.println(stra[i]);
        }

        String result = longestCommonPrefix(stra);

        System.out.println();
        System.out.println("Result : " + result);
    }
}
