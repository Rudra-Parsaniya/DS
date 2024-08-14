import java.util.Scanner;

public class BinarySearch91 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter value of array element");
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = length-1;
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int index = binarySearch(arr, length, n , left , right);
        if (index != -1) {
            System.out.println("element at index = " + index);
        } else {
            System.out.println("element not found ");
            sc.close();
        }  
    }
    public static int binarySearch(int[] arr, int length, int n, int left, int right){
        int middle;
        for(int i=0 ; i<length ; i++){
            middle = (left + right)/2;
            if(n == arr[middle]){
                return middle;
            }
            else if(n < arr[middle]){
                right = middle - 1;
            } 
            else{
                left = middle + 1;
            }
        }
        return -1;
    }

}