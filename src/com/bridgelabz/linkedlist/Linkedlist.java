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
        singleLinkedlist.add(56);
        singleLinkedlist.add(70);
        singleLinkedlist.insertAtMid(2,30);
        singleLinkedlist.display(singleLinkedlist.head);

    }
}
