package com.lesson.linkedlist.singly;

public class App {

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertFirst(10);
        linkedList.insertFirst(20);
        linkedList.insertFirst(30);
        linkedList.displayList();
        System.out.println();
        linkedList.insertEnd(100);
        linkedList.insertEnd(200);
        linkedList.insertFirst(40);
        linkedList.displayList();
        System.out.println();
        System.out.println("Deleting -> " + linkedList.deleteFirst());
        System.out.println("Deleting -> " + linkedList.deleteFirst());
        linkedList.displayList();
        System.out.println();
        System.out.println("Deleting -> " + linkedList.deleteEnd());
        System.out.println("Deleting -> " + linkedList.deleteEnd());
        linkedList.displayList();
        System.out.println();
    }
}
