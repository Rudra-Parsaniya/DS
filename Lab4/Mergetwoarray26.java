package Lab4;

import java.util.Scanner;
public class Mergetwoarray26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st array size : ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter 1st array elements : ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter 2nd array size : ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter 2nd array elements : ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        int mergesize = size1 + size2;
        int[] mergearr = new int[mergesize];
        for (int i = 0; i < size1; i++) {
            mergearr[i] = arr1[i];
        }
        for (int i = 0; i < size2; i++) {
            mergearr[size1 + i] = arr2[i];
        }

        System.out.println("Merged Array:");
        for (int i = 0; i < mergesize; i++) {
            System.out.print(mergearr[i] + " ");
        }
        sc.close();
    }
}

