
// Write a menu driven program to implement following operations on a circular queue using an Array
import java.util.Scanner;
public class CircularQueueUsing51 {
    int front, rear, size, capacity;
    int[] queue;

    public CircularQueueUsing51(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = this.rear = -1;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("\nCircular Queue is full\n");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        queue[rear] = data;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("\nCircular Queue is empty\n");
            return;
        }
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print("\n"+queue[i] + " \n");
            if (i == rear) break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the capacity of the queue: ");
        int capacity = scanner.nextInt();
        
        CircularQueueUsing51 queue = new CircularQueueUsing51(capacity);

        while (true) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exited");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}


