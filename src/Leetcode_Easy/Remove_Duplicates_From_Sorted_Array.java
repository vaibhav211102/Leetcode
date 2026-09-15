package Leetcode_Easy;
import java.util.Scanner;
public class Remove_Duplicates_From_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter the element of the array : ");

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Array : ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Array without duplicate : ");

//        for (int i = 0; i < a.length-1; i++) {
//            if (a[i] != a[i+1]){
//                System.out.print(a[i] + " ");
//            }
//        }
//
//        System.out.print(a[a.length - 1]);

        int index = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[index -1]){
                a[index] = a[i];
                index++;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
