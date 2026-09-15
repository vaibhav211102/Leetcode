package Leetcode_Easy;

import java.util.Scanner;

public class Remove_Element {
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
        System.out.println("Enter the value : ");
        int val = sc.nextInt();

        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != val){
                a[index] = a[i];
                index++;
            }
        }

        System.out.println();
        System.out.println("Array after removing element : ");

        for (int i = 0; i < index; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
