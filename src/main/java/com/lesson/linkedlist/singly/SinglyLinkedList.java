package com.lesson.linkedlist.singly;

public class SinglyLinkedList {

    private Node head = null;

    public boolean isEmpty(){
        return head==null;
    }

    /* Insert from the beginning of the list */
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /* Delete from the start of the list.*/
    public int deleteFirst() {
        if(isEmpty()){
            System.out.println("Linked List is Empty");
            return -1;
        } else {
            Node toBeDeletedNode = head;
            head = toBeDeletedNode.next;
            return toBeDeletedNode.data;
        }
    }

    /* Insert from the end of the list */
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
        } else {
            Node next = head;
            while (next.next != null){
                next = next.next;
            }
            next.next = newNode;
        }
    }

    /* Delete from the end of the list */
    public int deleteEnd() {
        if(isEmpty()){
            System.out.println("Linked List is Empty");
            return -1;
        } else {
            Node toBeDeletedNode = head;
            int data = 0;
            while (toBeDeletedNode.next != null){
                if(toBeDeletedNode.next.next !=null) {
                    toBeDeletedNode = toBeDeletedNode.next;
                } else {
                    data = toBeDeletedNode.next.data;
                    toBeDeletedNode.next = null;
                }
            }
            return data;
        }
    }

    /* Display the list */
    public void displayList() {
        if(isEmpty()){
            System.out.println("Its an Empty Linked List!!");
        } else {
            Node next = head;
            while(next!=null){
                System.out.print(next.data+" ");
                next = next.next ;
            }
        }

    }
}
