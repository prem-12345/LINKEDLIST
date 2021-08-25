package com.bridgelabz.linkedlist;

public class Linkedlist {

    public static void main(String[] args) {

        /**
         * Welcome to Linkedlist program
         *
         * @author prem
         * @version 12.0
         * @since 25/08/2021
         */

        MyLinkedlist singleLinkedlist = new MyLinkedlist();
        singleLinkedlist.insertAtHead(70);
        singleLinkedlist.insertAtHead(30);
        singleLinkedlist.insertAtHead(56);
        singleLinkedlist.display(singleLinkedlist.head);

    }
}
