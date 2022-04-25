package LinkedLised.CircularLinkedList;

import Services.DsaRunner;

import java.util.Scanner;

public class PlayWithCircularLinkedList implements DsaRunner{
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new LinkedLised.CircularLinkedList.PlayWithCircularLinkedList().run();
    }
    @Override
    public void run() {
        LinkedLised.CircularLinkedList.node head = null;
        CircularLinkedList CircularLinkedList = new CircularLinkedList();
        while (true) {
            System.out.print("\nChoose the operation to perform on LinkedList.\n1.Traverse\n2.InsertAtEnd\n3.InsertAtBeginning\n4.InsertAtIndex\n5.DeleteAtBeginning\n6.DeleteAtEnd\n7.DeleteAtIndex\n8.Search\n9.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CircularLinkedList.traversal(head);
                    break;
                case 2:
                    head = CircularLinkedList.insertAtEnd(head);
                    break;
                case 3:
                    head = CircularLinkedList.insertAtBeginning(head);
                    break;
                case 4:
                    System.out.println("Enter an index at which you want to enter the value: ");
                    int index = scanner.nextInt();
                    head = CircularLinkedList.insertAtIndex(head, index);
                    break;
                case 5:
                    head = CircularLinkedList.deleteAtBeginning(head);
                    break;
                case 6:
                    head = CircularLinkedList.deleteAtEnd(head);
                    break;
                case 7:
                    System.out.println("Enter an index at which you want to enter the value: ");
                    index = scanner.nextInt();
                    head = CircularLinkedList.deleteAtIndex(head, index);
                    break;
                case 8:
                    System.out.println("Enter the value you want to search: ");
                    int dataToSearch = scanner.nextInt();
                    CircularLinkedList.search(head, dataToSearch);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
