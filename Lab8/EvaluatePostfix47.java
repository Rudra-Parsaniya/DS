package Lab8;
import java.util.Stack;
import java.util.Scanner;

public class EvaluatePostfix47 {

    public static int evaluatePostfix(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= s.length() - 1; i++) {
            char temp = (s.charAt(i));
            if (Character.isDigit(temp)) {
                stack.push(temp - '0');
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

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
        System.out.println("Enter postfix expression");
        String s = sc.next();
        System.out.println(evaluatePostfix(s));
        sc.close();
    }
}