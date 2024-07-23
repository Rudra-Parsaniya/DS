import java.util.Arrays;
import java.util.Scanner;
public class SortNnames20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N names you want to sort: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        Arrays.sort(names);

        System.out.println("The sorted names are:");
        for (String name : names) {
            System.out.println(name);
        }
        scanner.close();
    }
}
