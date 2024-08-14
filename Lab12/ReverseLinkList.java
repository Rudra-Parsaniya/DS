package Lab12;
//Write a program to reverse a linked list.
public class ReverseLinkList {
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
    public Node ReverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.Link;
            current.Link = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
public static void main(String[] args) {
    ReverseLinkList list = new ReverseLinkList();
    list.InsertAtFirst(1);
    list.InsertAtFirst(2);
    list.InsertAtFirst(3);
    list.InsertAtFirst(4);
    list.InsertAtFirst(5);
    list.InsertAtFirst(6);
    list.InsertAtFirst(7);
    list.InsertAtFirst(8);
    list.InsertAtFirst(9);
    list.InsertAtFirst(10);
    Node head = list.first;
    list.ReverseLinkedList(head);
    while (head != null) {
        System.out.println(head.data);
        head = head.Link;
        


}
    }
}

