package org.example.randomProg;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListMiddle {
    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // This is the middle node
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        // head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        Node middle = findMiddle(head);
        System.out.println("Middle element: " + middle.data);
    }
}
