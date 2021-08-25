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

        /**
         * UC8 Ability to insert 40 after 30 to the linkedlist(56-30-40-70).
         *
         * @author prem
         * @version 12.8
         * @since 25/08/2021
         */

        MyLinkedlist singleLinkedlist = new MyLinkedlist();
        singleLinkedlist.add(56);
        singleLinkedlist.add(30);
        singleLinkedlist.add(70);
        singleLinkedlist.sort();
        singleLinkedlist.display(singleLinkedlist.head);

    }

}
