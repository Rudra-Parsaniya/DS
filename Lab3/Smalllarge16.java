import java.util.Scanner;
public class Smalllarge16 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = 0;
    int min = 0;
    System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter  array element : ");
            array[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(array[i]>array[max]){
                max=i;
            }
            if(array[i]<array[min]){
                min=i;
            }
        }
        System.out.println("Largest element is at position : "+array[max]);
        System.out.println("Smallest element is at position : "+array[min]);
    sc.close();
    }
}