import java.util.Scanner;
public class Secondconverter9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");    
        int sec = sc.nextInt();
        int hr = sec/3600;
        int remainingsec = sec % 3600;
        int min = remainingsec/60;
        int seconds = remainingsec % 60;
        System.out.println(sec+ " seconds is " +hr+ ":" +min+ ":" +seconds);
        sc.close();
    }
}
