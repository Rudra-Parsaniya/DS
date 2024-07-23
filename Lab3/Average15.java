import java.util.Scanner;
public class Average15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        double sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum + i;
            }
        double average = sum/n;
        System.out.print("Average is "+ average);
        sc.close();
    }
}
