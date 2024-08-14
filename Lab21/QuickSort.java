import java.util.Scanner;

public class QuickSort {

    // Method to perform QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int j = partition(arr, low, high);
            quickSort(arr, low, j - 1);
            quickSort(arr, j + 1, high);
        }
    }

    // Method to partition the array
    public static int partition(int[] arr, int low, int high) {
        int i = low;
        int j = high + 1;
        int key = arr[low];
        boolean flag = true;

        while (flag) {
            i++;

            // Repeat while arr[i] < key
            while (i <= high && arr[i] < key) {
                i++;
            }

            j--;

            // Repeat while arr[j] > key
            while (arr[j] > key) {
                j--;
            }

            if (i < j) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else {
                flag = false;
            }
        }

        // Swap arr[low] and arr[j]
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Get the elements of the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Perform QuickSort
        quickSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println("Sorted array:");
        printArray(arr);

        scanner.close();
    }
}
