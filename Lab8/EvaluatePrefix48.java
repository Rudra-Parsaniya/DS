package Lab8;

import java.util.Stack;
import java.util.Scanner;

public class EvaluatePrefix48 {
    public static int evaluatePrefix(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char temp = s.charAt(i);
            if (Character.isDigit(temp)) {
                stack.push(temp - '0');
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();

                switch (temp) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter prefix expression");
        String s = sc.next();
        System.out.println(evaluatePrefix(s));
        sc.close();
    }
}
