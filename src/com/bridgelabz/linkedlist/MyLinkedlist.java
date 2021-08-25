package com.bridgelabz.linkedlist;

class Node<T> {
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedlist<T> {

    /**
     * UC1 Create a simple linkedlist of 56,30 and 70.
     *
     * @author prem
     * @version 12.1
     * @since 25/08/2021
     */

    Node head = null;
    Node tail;

    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void display(Node head) {
        if (isEmpty()) {
            System.out.println("Empty Linkedlist");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }


}

