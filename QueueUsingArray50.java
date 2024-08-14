// Write a menu driven program to implement following operations on the Queue using an Array
import java.util.Scanner;

class QueueUsingArray50 {
    int queue[];
    int front, rear, size;
    int MAX_SIZE = 10;
    Scanner sc;

    public QueueUsingArray50() {
        queue = new int[MAX_SIZE];
        front = 0; 
        rear = -1;
        size = 0;
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        QueueUsingArray50 q = new QueueUsingArray50();

        while (true) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            int choice = q.sc.nextInt();
            switch (choice) {
                case 1:
                    q.Enqueue();
                    break;
                case 2:
                    q.Dequeue();
                    break;
                case 3:
                    q.Display();
                    break;
                case 4:
                    System.out.println("Exiting");
                    q.sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void Enqueue() {
        if (size == MAX_SIZE) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % MAX_SIZE;
        System.out.print("\nEnter value to enqueue: ");
        int value = sc.nextInt();
        queue[rear] = value;
        size++;
    }

    public void Dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("\nDequeued value: " + queue[front]);
        front = (front + 1) % MAX_SIZE;
        size--;
        if (size == 0) {
            front = 0;
            rear = -1;
        }
    }

    public void Display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("\nQueue elements: ");
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % MAX_SIZE;
        }
        System.out.println();
    }
}
