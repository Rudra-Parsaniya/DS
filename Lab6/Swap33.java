package Lab6;

import java.util.Scanner;

public class Swap33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter  the second number ");
        int b = sc.nextInt();
        System.out.println("Before swapping: " + a + "," + b);
        swap(a, b);
        sc.close();

    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping" + a + "," + b);

    }
}
