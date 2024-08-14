// Write a program to implement a Linear Search using Array.
import java.util.Scanner;
public class LinearSearchinArray90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("\nEnter elements of Array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nEnter element to search : ");
        int target = sc.nextInt();
        int result = linearSearch(arr, target);
        if(result == -1){
            System.out.println("\nElement not found");
        }
        else{
        System.out.println("\nElement found at index " + result);
        sc.close();
        }
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
            
        }
        return -1;
        
    }
}




      
 