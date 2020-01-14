package com.lesson.linkedlist.reverse;

import com.lesson.linkedlist.singly.SinglyLinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {

        System.out.println("Construct a Singly Linked List");
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(500);
        singlyLinkedList.insertFirst(400);
        singlyLinkedList.insertFirst(300);
        singlyLinkedList.insertFirst(200);
        singlyLinkedList.insertFirst(100);
        singlyLinkedList.displayList();
        System.out.println();
        System.out.println("Reversing a Singly Linked List in Place.");
        singlyLinkedList.reverse();
        singlyLinkedList.displayList();

    }

}
