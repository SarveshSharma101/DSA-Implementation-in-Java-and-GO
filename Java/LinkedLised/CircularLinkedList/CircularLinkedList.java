package LinkedLised.CircularLinkedList;

import java.util.Scanner;

public class CircularLinkedList {
    private Scanner sc = new Scanner(System.in);
    public boolean isEmpty(LinkedLised.CircularLinkedList.node head){
        return head == null;
    }

    public void traversal(LinkedLised.CircularLinkedList.node head){
        if (!isEmpty(head)) {
            LinkedLised.CircularLinkedList.node temp = head;
            do{
                System.out.println("--->" + temp.data);
                temp = temp.next;
            } while (temp != head);
        }else
            System.out.println("Linked list is empty, nothing to print");
    }

    public LinkedLised.CircularLinkedList.node insertAtEnd(LinkedLised.CircularLinkedList.node head){
        System.out.println("Enter the value you want to insert in the Linked list: ");
        int value = sc.nextInt();
        if (isEmpty(head)){
            head = new LinkedLised.CircularLinkedList.node(value);
            head.next = head;
            return head;
        }
        LinkedLised.CircularLinkedList.node temp = head;
        while (temp.next!=head)
            temp = temp.next;

        LinkedLised.CircularLinkedList.node newNode = new LinkedLised.CircularLinkedList.node(value);
        temp.next = newNode;
        newNode.next = head;
        return head;
    }

    public LinkedLised.CircularLinkedList.node insertAtBeginning(LinkedLised.CircularLinkedList.node head){
        System.out.println("Enter the value you want to insert in the Linked list: ");
        int value = sc.nextInt();
        if (isEmpty(head)){
            head = new LinkedLised.CircularLinkedList.node(value);
            head.next = head;
            return head;
        }
        LinkedLised.CircularLinkedList.node newNode = new LinkedLised.CircularLinkedList.node(value);
        LinkedLised.CircularLinkedList.node temp = head;
        while (temp.next!=head)
            temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
        return newNode;
    }

    public LinkedLised.CircularLinkedList.node insertAtIndex(LinkedLised.CircularLinkedList.node head, int index){
        System.out.println("Enter the value you want to insert in the Linked list: ");
        int value = sc.nextInt();
        if (index == 0){
            return insertAtBeginning(head);
        }
        LinkedLised.CircularLinkedList.node temp = head;
        for (int i=0; i<index-1; i++){
            temp = temp.next;
        }
        LinkedLised.CircularLinkedList.node newNode = new LinkedLised.CircularLinkedList.node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public LinkedLised.CircularLinkedList.node deleteAtBeginning(LinkedLised.CircularLinkedList.node head){
        if (isEmpty(head)) {
            System.out.println("Linked List is empty, nothing to delete");
            return head;
        }
        LinkedLised.CircularLinkedList.node temp = head;
        while (temp.next!=head)
            temp = temp.next;
        temp.next = head.next;
        head = head.next;
        return head;
    }

    public LinkedLised.CircularLinkedList.node deleteAtEnd(LinkedLised.CircularLinkedList.node head){
        if (isEmpty(head)) {
            System.out.println("Linked List is empty, nothing to delete");
            return head;
        }
        LinkedLised.CircularLinkedList.node temp = head;
        while (temp.next.next!=head)
            temp = temp.next;
        temp.next = head;
        return head;
    }

    public LinkedLised.CircularLinkedList.node deleteAtIndex(LinkedLised.CircularLinkedList.node head, int index){
        if (index == 0){
            return deleteAtBeginning(head);
        }
        LinkedLised.CircularLinkedList.node temp = head;
        for (int i=0; i<index-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public void search(LinkedLised.CircularLinkedList.node head, int dataToSearch){
        LinkedLised.CircularLinkedList.node temp = head;
        do {
            if (temp.data == dataToSearch) {
                System.out.println("Data found!!!");
                return;
            }
            temp = temp.next;
        }while (temp!=head);
        System.out.println("Data not found");
    }

}

class node{

    public node(int data) {
        this.data = data;
        this.next = null;
    }

    int data;
    LinkedLised.CircularLinkedList.node next;
}
