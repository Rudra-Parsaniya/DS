import java.util.Scanner;

public class CircularLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    public void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        if (position == 0) {
            if (head.next == head) {
                head = null;
            } else {
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            return;
        }

        Node prev = null;
        int count = 0;
        while (temp.next != head && count < position) {
            prev = temp;
            temp = temp.next;
            count++;
        }

        if (count == position) {
            prev.next = temp.next;
        } else {
            System.out.println("Position out of bounds");
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Insert a node at the front");
            System.out.println("2. Delete a node from a specified position");
            System.out.println("3. Insert a node at the end");
            System.out.println("4. Display all nodes");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at the front: ");
                    int frontData = scanner.nextInt();
                    list.insertAtFront(frontData);
                    break;
                case 2:
                    System.out.print("Enter position to delete node: ");
                    int position = scanner.nextInt();
                    list.deleteFromPosition(position);
                    break;
                case 3:
                    System.out.print("Enter data to insert at the end: ");
                    int endData = scanner.nextInt();
                    list.insertAtEnd(endData);
                    break;
                case 4:
                    System.out.println("Circular linked list nodes:");
                    list.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("sacho option nakha");
            }
        }
    }
}

