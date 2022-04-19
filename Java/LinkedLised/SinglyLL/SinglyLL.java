package LinkedLised.SinglyLL;

import java.util.Scanner;

public class SinglyLL {

    private Scanner sc = new Scanner(System.in);
    public boolean isEmpty(node head){
        return head == null;
    }

    public void traversal(node head){
        if (!isEmpty(head)) {
            node temp = head;
            while (temp != null) {
                System.out.println("--->" + temp.data);
                temp = temp.next;
            }
        }else
            System.out.println("Linked list is empty, nothing to print");
    }

    public node insertAtEnd(node head){
        System.out.println("Enter the value you want to insert in the Linked list: ");
        int value = sc.nextInt();
        if (isEmpty(head)){
            return new node(value);
        }
        node temp = head;
        while (temp.next!=null)
            temp = temp.next;

        node newNode = new node(value);
        temp.next = newNode;
        return head;
    }

    public node insertAtBeginning(node head){
        System.out.println("Enter the value you want to insert in the Linked list: ");
        int value = sc.nextInt();
        if (isEmpty(head)){
            head = new node(value);
            return head;
        }
        node newNode = new node(value);
        newNode.next = head;
        return newNode;
    }

    public node insertAtIndex(node head, int index){
        System.out.println("Enter the value you want to insert in the Linked list: ");
        int value = sc.nextInt();
        if (index == 0){
            return insertAtBeginning(head);
        }
        node temp = head;
        for (int i=0; i<index-1; i++){
            temp = temp.next;
        }
        node newNode = new node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public node deleteAtBeginning(node head){
        if (isEmpty(head)) {
            System.out.println("Linked List is empty, nothing to delete");
            return head;
        }
        head = head.next;
        return head;
    }

    public node deleteAtEnd(node head){
        if (isEmpty(head)) {
            System.out.println("Linked List is empty, nothing to delete");
            return head;
        }
        node temp = head;
        while (temp.next.next!=null)
            temp = temp.next;
        temp.next = null;
        return head;
    }

    public node deleteAtIndex(node head, int index){
        if (index == 0){
            return deleteAtBeginning(head);
        }
        node temp = head;
        for (int i=0; i<index-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public void search(node head, int dataToSearch){
        node temp = head;
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
    }

    int data;
    node next;
}
