package Lab12;
import java.util.*;
class CopyLinkedList63{
    class Node {
        int data;
        Node Link;

        public Node(int data) {
            this.data = data;
            this.Link = null;
        }
    }

    public Node first = null;

    public void InsertAtFirst(int data){
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            return;
        }

        newNode.Link = first;
        first = newNode;
    }

    public Node CopyLinkedList(Node first) {
        Node copyFirst = null;
        Node copyLast = null;

        while (first != null) {
            Node newNode = new Node(first.data);
            if (copyFirst == null) {
                copyFirst = newNode;
                } 
            else {
                copyLast.Link = newNode;
                }
            copyLast = newNode;
            first = first.Link;
            }
            return copyFirst;
            }

    public void DisplayLinkedList(Node node) {
        if (node == null) {
            System.out.println("No Nodes to Display");
            return;
        }
        Node save = node;
        while (save != null) {
            System.out.print(save.data + " ");
            save = save.Link;
        }
        System.out.println();
    }
   
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    CopyLinkedList63 list = new CopyLinkedList63();
    list.InsertAtFirst(1);
    list.InsertAtFirst(2);
    list.InsertAtFirst(3);
    list.InsertAtFirst(4);
    list.InsertAtFirst(5);

    Node CopyLinkedList = list.CopyLinkedList(list.first);

    System.out.println("Original LinkedList : ");
    list.DisplayLinkedList(list.first);

    System.out.println("Copied LinkedList : ");
    list.DisplayLinkedList(CopyLinkedList); 
    sc.close();
}
}