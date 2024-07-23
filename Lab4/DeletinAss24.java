package Lab4;
import java.util.*;
public class DeletinAss24 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements in ascending order: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to delete : ");
        int delete = sc.nextInt();
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == delete) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Number not found in the array.");
        }
        else {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }

            System.out.print("Final array : ");
            for (int i = 0; i < (size - 1); i++) {
                System.out.print(arr[i] + " ");
            }
        }
        
        sc.close();
    }
}