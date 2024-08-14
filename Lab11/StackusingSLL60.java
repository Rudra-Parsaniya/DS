package Lab11;

import java.util.*;

class Stack {
    class Node {
        int info;
        Node link;

        public Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    Node top = null;
    Node first = null;

    public void push(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            return;
        }
        Node temp = first;
        first = newNode;
        first.link = temp;
    }

    public int pop() {
        if (first == null) {
            System.out.println("stack is underflow");
        } else {
            first = first.link;
        }
        return first.info;
    }

    public void display() {
        System.out.println("ans is");
        while (first != null) {
            System.out.println(first.info + ",");
            first = first.link;

        }
    }
}

public class StackusingSLL60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack S1 = new Stack();

        while (true) {
            System.out.println("Enter 1 to push");
            System.out.println("Enter 2 to pop");
            System.out.println("Enter 3 to Display");
            System.out.println("Enter 4 to Exit");
            int c = sc.nextInt();
            int data;

            if (c == 1) {
                System.out.println("Enter Element for push");
                data = sc.nextInt();
                S1.push(data);
            }
            if (c == 2) {
                S1.pop();
            }
            if (c == 3) {
                S1.display();

            }
            if (c == 4) {
                break;

            }
        }
    }
}