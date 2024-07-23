import java.util.Scanner;
public class CaseSwap27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'a' && c <= 'z') {
                chars[i] = (char) (c - 32);
            } else if (c >= 'A' && c <= 'Z') {
                chars[i] = (char) (c + 32);
            }
        }
        String output = new String(chars);
        System.out.println("Swapped string: " + output);
        sc.close();
    }
}