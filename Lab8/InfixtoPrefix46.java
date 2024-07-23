package Lab8;
import java.util.Stack;
public class InfixtoPrefix46 {
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

    // Method to check if a character is an operator
    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Method to reverse a string and swap parentheses
    public static String reverseAndSwap(String expr) {
        StringBuilder result = new StringBuilder();
        for (int i = expr.length() - 1; i >= 0; i--) {
            char c = expr.charAt(i);
            if (c == '(') {
                result.append(')');
            } else if (c == ')') {
                result.append('(');
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Method to convert infix to postfix
    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
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
            else if (isOperator(c)) {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    // Method to convert infix to prefix
    public static String infixToPrefix(String expression) {
        // Reverse and swap parentheses
        String reversedExpression = reverseAndSwap(expression);
        // Convert reversed infix to postfix
        String postfix = infixToPostfix(reversedExpression);
        // Reverse postfix to get prefix
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {
        String expression = "(a-b/c)*(a/k-l)";
        System.out.println("Infix Expression: " + expression);
        String prefix = infixToPrefix(expression);
        System.out.println("Prefix Expression: " + prefix);
    }
}