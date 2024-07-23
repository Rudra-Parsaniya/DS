package Lab1;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no.");
        int a = sc.nextInt();
        int ans = 1;
        if(a==0){
            System.out.println("enter no. greater than 0");
        }
        else{
        for(int i=1;i<=a;i++){
            ans = ans*i;
        }
        System.out.println(ans);
        sc.close();
    }
    }

}
