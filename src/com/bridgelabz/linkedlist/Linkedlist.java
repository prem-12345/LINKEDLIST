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
        singleLinkedlist.add(30);
        singleLinkedlist.add(70);
        singleLinkedlist.display(singleLinkedlist.head);

        if (singleLinkedlist.searchKey(30)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
