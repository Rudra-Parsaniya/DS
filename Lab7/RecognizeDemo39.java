package Lab7;
//39. How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Write a 
//program to solve the above problem. 
import java.util.Scanner;
public class RecognizeDemo39 {
    int TOP;
    int MAX;
    char[] s;
    public RecognizeDemo39(int size) {
        MAX = size;
        s=new char[size];
        TOP = -1;
    }
    public void push(char value) {
        if (TOP >= MAX - 1) {
            System.out.println("Stack Overflow");
        } else {
            s[++TOP] = value;
        }
    }
    public char pop() {
        if (TOP < 0) {
            System.out.println("Stack Underflow");
            return ' ';
        } else {
            char value =s[TOP--];
            return value;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RecognizeDemo39 rd=new RecognizeDemo39(5);
        rd.push('c');
        String str="abcbb";
        int index=0;
        char next=str.charAt(index);
        while (next!='c') {
            if(index==str.length()-1){
                System.out.println("string is invalid");
            }
            else{
                rd.push(next);
                index++;
                next=str.charAt(index);
            }
        }
        index++;
        next=str.charAt(index);
        char ch=rd.pop();
        while (ch!='c') {
            if(ch!=next)
            {
                System.out.println("Not ready");
                return;
            }
            ch=rd.pop();
            index++;
            if(index<str.length())
            {
                next=str.charAt(index);
            }
        }
        System.out.println("ready");
    }
}
