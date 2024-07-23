package Lab4;
import java.util.*;
public class Insertinascending23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements in ascending order: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter number to insert: ");
        int a = sc.nextInt();
        int[] newarr = new int[arr.length + 1];
        int i = 0;
        while (i < size && arr[i] < a) {
            newarr[i] = arr[i];
            i++;
        }        
        newarr[i] = a;        
        for (int j = i; j < size; j++) {
            newarr[j + 1] = arr[j];
        }
        arr = newarr;
        System.out.println("Final array: " + Arrays.toString(arr));
        sc.close();
    }
}