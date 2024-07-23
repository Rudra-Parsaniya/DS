import java.util.Scanner;
public class SumtoNnumbers11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int sum2 = 0;
            for (int j = 1; j <= i; j++) {
                sum2 = sum2 + j;
                }
                sum = sum + sum2;
            }
            System.out.println("Sum is: " + sum);
            sc.close();
        }
}
