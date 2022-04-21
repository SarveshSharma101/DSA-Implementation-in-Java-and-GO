package LinkedLised.DoublyLinkedList;

import java.util.Scanner;

public class DoublyLinkedList {
    private Scanner sc = new Scanner(System.in);
    public boolean isEmpty(LinkedLised.DoublyLinkedList.node head){
        return head == null;
    }

    public void traversal(LinkedLised.DoublyLinkedList.node head){
        if (!isEmpty(head)) {
            LinkedLised.DoublyLinkedList.node temp = head;
            while (temp != null) {
                System.out.println("--->" + temp.data);
                temp = temp.next;
            }
        }else
            System.out.println("Linked list is empty, nothing to print");
    }

    public void reverseTraversal(LinkedLised.DoublyLinkedList.node head){
        if (!isEmpty(head)) {
            LinkedLised.DoublyLinkedList.node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            while (temp != null){
                System.out.println("--->" + temp.data);
                temp = temp.prev;
            }
        }else
            System.out.println("Linked list is empty, nothing to print");
    }

    public LinkedLised.DoublyLinkedList.node insertAtEnd(LinkedLised.DoublyLinkedList.node head){
        System.out.println("Enter the value you want to insert in the Linked list: ");
        int value = sc.nextInt();
        if (isEmpty(head)){
            return new LinkedLised.DoublyLinkedList.node(value);
        }
        LinkedLised.DoublyLinkedList.node temp = head;
        while (temp.next!=null)
            temp = temp.next;

        LinkedLised.DoublyLinkedList.node newNode = new LinkedLised.DoublyLinkedList.node(value);
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }

    public LinkedLised.DoublyLinkedList.node insertAtBeginning(LinkedLised.DoublyLinkedList.node head){
        System.out.println("Enter the value you want to insert in the Linked list: ");
        int value = sc.nextInt();
        if (isEmpty(head)){
            head = new LinkedLised.DoublyLinkedList.node(value);
            return head;
        }
        LinkedLised.DoublyLinkedList.node newNode = new LinkedLised.DoublyLinkedList.node(value);
        newNode.next = head;
        head.prev = newNode;
        return newNode;
    }

    public LinkedLised.DoublyLinkedList.node insertAtIndex(LinkedLised.DoublyLinkedList.node head, int index){
        System.out.println("Enter the value you want to insert in the Linked list: ");
        int value = sc.nextInt();
        if (index == 0){
            return insertAtBeginning(head);
        }
        LinkedLised.DoublyLinkedList.node temp = head;
        for (int i=0; i<index-1; i++){
            temp = temp.next;
        }
        LinkedLised.DoublyLinkedList.node newNode = new LinkedLised.DoublyLinkedList.node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }

    public LinkedLised.DoublyLinkedList.node deleteAtBeginning(LinkedLised.DoublyLinkedList.node head){
        if (isEmpty(head)) {
            System.out.println("Linked List is empty, nothing to delete");
            return head;
        }
        head = head.next;
        head.prev = null;
        return head;
    }

    public LinkedLised.DoublyLinkedList.node deleteAtEnd(LinkedLised.DoublyLinkedList.node head){
        if (isEmpty(head)) {
            System.out.println("Linked List is empty, nothing to delete");
            return head;
        }
        LinkedLised.DoublyLinkedList.node temp = head;
        while (temp.next.next!=null)
            temp = temp.next;
        temp.next = null;
        return head;
    }

    public LinkedLised.DoublyLinkedList.node deleteAtIndex(LinkedLised.DoublyLinkedList.node head, int index){
        if (index == 0){
            return deleteAtBeginning(head);
        }
        LinkedLised.DoublyLinkedList.node temp = head;
        for (int i=0; i<index-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (temp.next!=null) {
            temp.next.prev = temp;
        }
        return head;
    }

    public void search(LinkedLised.DoublyLinkedList.node head, int dataToSearch){
        LinkedLised.DoublyLinkedList.node temp = head;
        while (temp!=null){
            if (temp.data == dataToSearch) {
                System.out.println("Data found!!!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Data not found");
    }
}

class node{

    public node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    int data;
    LinkedLised.DoublyLinkedList.node next;
    LinkedLised.DoublyLinkedList.node prev;
}