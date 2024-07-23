import java.util.Scanner;
public class Array13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter  array element : ");
            array[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.print(array[i]+ " ");
        }
        sc.close();
    }
}