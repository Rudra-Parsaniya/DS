package Lab1;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if(a%2==0){
            System.out.println("even");

        }
        else{
            System.out.println("odd");
        }
        sc.close(); 
    }
     
}