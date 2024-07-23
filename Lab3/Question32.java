
import java.util.*;

public class Question32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many words to save:");
        int size = sc.nextInt();
        sc.nextLine();  // Consume the newline character
        String[] userArray = new String[size];
        
        for (int i = 0; i < size; i++) {
            System.out.println("Enter word " + (i + 1) + ":");
            userArray[i] = sc.nextLine();
        }
        
        int number = (int) (Math.random() * size);
        System.out.println("The word at random index " + number + " is " + userArray[number]);
        System.out.println("Enter the anagram of the word shown above:");
        String anagram = sc.nextLine();
        String originalWord = userArray[number];
        
        if (anagram.length() != originalWord.length()) {
            System.out.println("Please enter a word of the same length.");
        } else {
            if (areAnagrams(anagram, originalWord)) {
                System.out.println("Correct! The words are anagrams.");
            } else {
                System.out.println("Incorrect. The words are not anagrams.");
            }
        }

        sc.close();
    }

    public static boolean areAnagrams(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
