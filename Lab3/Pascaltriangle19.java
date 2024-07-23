import java.util.Scanner;
public class Pascaltriangle19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print("__");
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "___");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
        sc.close();
    }
} 
