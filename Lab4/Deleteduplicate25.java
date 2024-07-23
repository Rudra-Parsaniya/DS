package Lab4;
import java.util.*;;
public class Deleteduplicate25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements :");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int[] temp = new int[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            boolean flag = false;
            for (int k = 0; k < i; k++) {
                if (array[i] == array[k]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                temp[j++] = array[i];
            }
        }

        System.out.println("Final array : ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
        sc.close();
    }
}