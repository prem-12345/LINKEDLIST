package com.bridgelabz.linkedlist;

import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedlist {

    /**
     * UC1 Create a simple linkedlist of 56,30 and 70.
     *
     * @author prem
     * @version 12.1
     * @since 25/08/2021
     */

    Node head = null;
    Node tail;

    public void add(int data) {
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

    /**
     * UC2 Ability to create linkedlist by adding 30 and 56 to 70.
     *
     * @author prem
     * @version 12.2
     * @since 25/08/2021
     */

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    /**
     * UC3 Ability to create linkedlist by appending 30 and 70 to 56.
     *
     * @author prem
     * @version 12.3
     * @since 25/08/2021
     */

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            insertAtHead(data);
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
    }

    /**
     * UC4 Ability to insert 30 between 56 and 70.
     *
     * @author prem
     * @version 12.4
     * @since 25/08/2021
     */

    public void insertAtMid(int position, int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            System.out.println("Empty Linkedlist");
            return;
        }

        Node temp = head;
        int idx = 1;
        while (temp.next != null) {
            if (idx == position - 1) {
                break;
            }
            idx++;
            temp = temp.next;
        }
        Node nxt = temp.next;
        temp.next = newNode;
        newNode.next = nxt;
    }

    /**
     * UC5 Ability to delete first element in the linkedlist .
     *
     * @author prem
     * @version 12.5
     * @since 25/08/2021
     */

    public Node pop() {
        if (isEmpty()) {
            System.out.println("Empty Linkedlist");
            return head;
        }
        Node newHead = head.next;
        return newHead;
    }

    /**
     * UC6 Ability to delete last element in the linkedlist .
     *
     * @author prem
     * @version 12.6
     * @since 25/08/2021
     */

    public void popLast() {
        if (isEmpty()) {
            System.out.println("Empty Linkedlist");
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    /**
     * UC7 Ability to serch linkedlist to find node with value 30.
     *
     * @author prem
     * @version 12.7
     * @since 25/08/2021
     */

    public boolean searchKey(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    /**
     * UC9 Ability to show size of the linkedlist.
     *
     * @author prem
     * @version 12.9
     * @since 25/08/2021
     */

    public void size() {
        if (isEmpty()) {
            System.out.println("Empty Linkedlist");
            return;
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Length Of Linkedlist: " + count);
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

    /**
     * UC10 Ability to create ordered linkedlist (ascending).
     *
     * @author prem
     * @version 12.10
     * @since 25/08/2021
     */

    public void sort() {
        Node current = head;
        Node nxt;

        while (current != null) {
            nxt = current.next;

            while (nxt != null) {

                if (current.data >= nxt.data) {

                    int temp = current.data;
                    current.data = nxt.data;
                    nxt.data = temp;

                }
                nxt = nxt.next;
            }
            current = current.next;
        }

    }
}

