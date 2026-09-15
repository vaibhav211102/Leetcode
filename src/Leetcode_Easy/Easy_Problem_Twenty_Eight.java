package Leetcode_Easy;

public class Easy_Problem_Twenty_Eight {

    public static boolean campare(String haystack,String needle,int idx){
        int n1 = haystack.length();
        int n2 = needle.length();

        for (int i = 0; i < n2; i++) {
            if (idx >= n1) return false;
            if (haystack.charAt(idx++) != needle.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static int strStr(String haystack,String needle){
        int n1 = haystack.length();
//        int n2 = needle.length();
        for (int i = 0; i < n1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (campare(haystack,needle,i) == true) {
                    return i;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int result = strStr("textbook","book");
        System.out.println(result);
    }
}
