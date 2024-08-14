package Lab10;
import java.util.Scanner;

class SingelyLinkedList56 {
    class Node {
        int data;
        Node Link;

        public Node(int data) {
            this.data = data;
            this.Link = null;
        }
    }

    public Node first = null;

    public void InsertAtFirst(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            return;
        }

        newNode.Link = first;
        first = newNode;
    }

    public void InsertAtEnd(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            return;
        }

        Node last = first;
        while (last.Link != null) {
            last = last.Link;
        }
        last.Link = newNode;
    }

    public void insertAtOrder(int data) {
        Node newNode = new Node(data);

        if (first == null || newNode.data <= first.data) {
            newNode.Link = first;
            first = newNode;
            return;
        }

        Node current = first;
        while (current.Link != null && newNode.data >= current.Link.data) {
            current = current.Link;
        }

        newNode.Link = current.Link;
        current.Link = newNode;
    }

    public void Delete(int Key) {
        if (first == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = first;
        Node prev = null;

        if (temp.data == Key) {
            first = temp.Link;
            return;
        }

        while (temp != null && temp.data != Key) {
            prev = temp;
            temp = temp.Link;
        }

        if (temp == null) {
            System.out.println("Node not Found");
            return;
        }

        prev.Link = temp.Link;
    }

    public int CountNodes() {
        int Count = 0;
        Node Save = first;
        while (Save != null) {
            Save = Save.Link;
            Count++;
        }
        return Count;
    }

    public void DisplayNodes() {
        if (first == null) {
            System.out.println("No Nodes to Display");
            return;
        }
        Node save = first;
        while (save != null) {
            System.out.print(save.data + " ");
            save = save.Link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingelyLinkedList56 list = new SingelyLinkedList56();

        while (true) {
            System.out.println("*");
            System.out.println("\nMenu: Singely Linked List");
            System.out.println("* 1. InsertAtFirst");
            System.out.println("* 2. InsertAtLast");
            System.out.println("* 3. InsertAtOrdered");
            System.out.println("* 4. Delete");
            System.out.println("* 5. Display");
            System.out.println("* 6. Count Nodes");
            System.out.println("* 7. Exit");
            System.out.println("*");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at first: ");
                    int dataFirst = sc.nextInt();
                    list.InsertAtFirst(dataFirst);
                    break;
                case 2:
                    System.out.print("Enter data to insert at end: ");
                    int dataEnd = sc.nextInt();
                    list.InsertAtEnd(dataEnd);
                    break;
                case 3:
                    System.out.print("Enter data to insert in order: ");
                    int dataOrder = sc.nextInt();
                    list.insertAtOrder(dataOrder);
                    break;
                case 4:
                    System.out.print("Enter data to delete: ");
                    int dataDelete = sc.nextInt();
                    list.Delete(dataDelete);
                    break;
                case 5:
                    list.DisplayNodes();
                    break;
                case 6:
                    int count = list.CountNodes();
                    System.out.println("Number of nodes: " + count);
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}