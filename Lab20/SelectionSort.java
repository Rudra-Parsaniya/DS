package Lab20;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Value Of A[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < n - 1; i++) {
            int Min_value = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[Min_value]) {
                    Min_value = j;
                }
            }
            if (Min_value != i) {
                int temp = arr[Min_value];
                arr[Min_value] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
