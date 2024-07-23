import java.util.Scanner;

public class Duplicatno17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        int count=0;

        for(int i=0; i<size; i++){
            System.out.println("enter array element");
            array[i] = sc.nextInt();
        }
        for(int i= 0;i<size;i++){
            for(int j=i+1; j<size; j++){
                if(array[i]==array[j]){
                    count++;
                    break;

                }
            }
        }
        if(count==0){
            System.out.println("duplicate not found");
        }
        else{
            System.out.println("duplicat found");
        }
        sc.close();
    }

    
}
