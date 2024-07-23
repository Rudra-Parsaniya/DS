package Lab5;

import java.util.Scanner;
public class Multiofmatrix31 {
    public static void main(String[] args) {
       
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements for the first matrix (3x2):");
        int[][] arr1 = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("arr1[" + i + "][" + j + "]: ");
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for the second matrix (2x3):");
        int[][] arr2 = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("arr2[" + i + "][" + j + "]: ");
                arr2[i][j] = sc.nextInt();
            }
        }
        sc.close();

        
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = 0; 
                for (int k = 0; k < 2; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("Resultant matrix after multiplication (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
        
}