import java.util.Scanner;
public class Daysconverter10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int day = sc.nextInt();
        int years = day / 365; 
        int remainingdays = day % 365;
        int weeks = remainingdays / 7;
        int days = remainingdays % 7;
        System.out.println(day+ " days is = " +years+ " year, " +weeks+ " week, " +days+ " days");
        sc.close();
    }
}
