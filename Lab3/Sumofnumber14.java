import java.util.Scanner;
public class Sumofnumber14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m : ");
        int m = sc.nextInt();
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=m; i<=n; i++){
            sum = sum + i;
            }
        System.out.print("Sum is "+sum);
        sc.close();
    }
}
