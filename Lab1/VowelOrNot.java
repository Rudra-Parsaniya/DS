package Lab1;
import java.util.Scanner;
public class VowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character:");
        char ch = sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("vowel");
        }
        else
        {
            System.out.println("consonent");
            sc.close();
        }
    }
    
    
}