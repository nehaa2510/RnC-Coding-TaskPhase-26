package practise;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {

    Node front, rear;

    void enque(int data) {

        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    int deque() {

        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return value;
    }

    int peek() {

        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }

        return front.data;
    }

    boolean isEmpty() {
        return front == null;
    }

    void display() {

        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class TASK1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int choice = 0;

        while (choice != 6) {
            System.out.println("\n1.enque 2.deque 3.peek 4.isempty 5.display 6.exit");
            System.out.print("enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("enter num: ");
                    int num = sc.nextInt();
                    q.enque(num);
                    break;
                case 2:
                    q.deque();
                    break;
                case 3:
                    System.out.println("front: " + q.peek());
                    break;
                case 4:
                    System.out.println("isempty: " + q.isEmpty());
                    break;
                case 5:
                    q.display();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("invalid");
            }
        }
        sc.close();
    }
}

