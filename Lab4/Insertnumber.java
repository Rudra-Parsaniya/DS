package Lab4;
import java.util.Scanner;
public class Insertnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<size ;i++ ){
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter a index you want to add :");
        int index = scanner.nextInt();
        System.out.println("Enter a number you want to add :");
        int number = scanner.nextInt();
        int[] newArray = new int[size+1];
            for(int i = 0; i<index ;i++ ){
                newArray[i] = array[i];
                }
                newArray[index] = number;
                for(int i = index+1; i<size+1 ;i++ ){
                    newArray[i] = array[i-1];
                    }
                    System.out.println("After adding the number at the given index: ");
                    for(int i = 0; i<size+1 ;i++ ){
                        System.out.print(newArray[i]+" ");
                        
                        }
            
    }
}