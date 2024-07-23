package Lab4;
import java.util.*;
public class Deleteinarray22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the index of number to delete: ");
        int a = sc.nextInt();
        
        if (a < 0 || a >= arr.length) {
            System.out.println("Invalid Index");
        }
        int[] newarr = new int[arr.length - 1];

        for (int i=0,j=0;i<arr.length;i++) {
            if (i != a) {
                newarr[j++] = arr[i];
            }
        }
        arr = newarr;
        System.out.println("Final array : " + Arrays.toString(arr));
        sc.close();
    }
}