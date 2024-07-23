package Lab8;
import java.util.Stack;

public class InfixtoPostfix45 {

    // Method to return precedence of operators
    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Method to convert infix expression to postfix expression
    public static String infixToPostfix(String expression) {
        // Initializing empty String for result
        StringBuilder result = new StringBuilder();

        // Initializing empty stack
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If the scanned character is an operand, add it to output
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If the scanned character is '(', push it to the stack
            else if (c == '(') {
                stack.push(c);
            }
            // If the scanned character is ')', pop and output from the stack
            // until an '(' is encountered
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            // An operator is encountered
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String expression = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Infix Expression: " + expression);
        System.out.println("Postfix Expression: " + infixToPostfix(expression));
    }
}