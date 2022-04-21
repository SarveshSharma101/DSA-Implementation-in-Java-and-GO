package LinkedLised.DoublyLinkedList;

import Services.DsaRunner;

import java.util.Scanner;

public class PlayWithDoublyLinkedList implements DsaRunner {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new LinkedLised.DoublyLinkedList.PlayWithDoublyLinkedList().run();
    }

    @Override
    public void run() {
        LinkedLised.DoublyLinkedList.node head = null;
        DoublyLinkedList DoublyLinkedList = new DoublyLinkedList();
        while (true) {
            System.out.print("\nChoose the operation to perform on LinkedList.\n1.Traverse\n2.InsertAtEnd\n3.InsertAtBeginning\n4.InsertAtIndex\n5.DeleteAtBeginning\n6.DeleteAtEnd\n7.DeleteAtIndex\n8.Search\n9.Reverse Travel\n10.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    DoublyLinkedList.traversal(head);
                    break;
                case 2:
                    head = DoublyLinkedList.insertAtEnd(head);
                    break;
                case 3:
                    head = DoublyLinkedList.insertAtBeginning(head);
                    break;
                case 4:
                    System.out.println("Enter an index at which you want to enter the value: ");
                    int index = scanner.nextInt();
                    head = DoublyLinkedList.insertAtIndex(head, index);
                    break;
                case 5:
                    head = DoublyLinkedList.deleteAtBeginning(head);
                    break;
                case 6:
                    head = DoublyLinkedList.deleteAtEnd(head);
                    break;
                case 7:
                    System.out.println("Enter an index at which you want to enter the value: ");
                    index = scanner.nextInt();
                    head = DoublyLinkedList.deleteAtIndex(head, index);
                    break;
                case 8:
                    System.out.println("Enter the value you want to search: ");
                    int dataToSearch = scanner.nextInt();
                    DoublyLinkedList.search(head, dataToSearch);
                    break;
                case 9:
                    DoublyLinkedList.reverseTraversal(head);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
    
}
