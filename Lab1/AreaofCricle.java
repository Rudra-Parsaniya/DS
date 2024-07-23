package Lab1;
import java.util.Scanner;
public class AreaofCricle {
    

    public static void main(String[] args) {
        System.out.println("enetr value of radius");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = Math.PI*radius*radius;
        System.out.println("the area is" + area);
        sc.close();

    }
}