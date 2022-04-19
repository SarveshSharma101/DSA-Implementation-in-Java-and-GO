package LinkedLised.SinglyLL;

import Services.DsaRunner;

import java.util.Scanner;

public class PLayWithLinkedList implements DsaRunner {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new PLayWithLinkedList().run();
    }
    @Override
    public void run() {
        node head = null;
        SinglyLL singlyLL = new SinglyLL();
        while (true) {
            System.out.print("\nChoose the operation to perform on LinkedList.\n1.Traverse\n2.InsertAtEnd\n3.InsertAtBeginning\n4.InsertAtIndex\n5.DeleteAtBeginning\n6.DeleteAtEnd\n7.DeleteAtIndex\n8.Search\n9.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    singlyLL.traversal(head);
                    break;
                case 2:
                    head = singlyLL.insertAtEnd(head);
                    break;
                case 3:
                    head = singlyLL.insertAtBeginning(head);
                    break;
                case 4:
                    System.out.println("Enter an index at which you want to enter the value: ");
                    int index = scanner.nextInt();
                    head = singlyLL.insertAtIndex(head, index);
                    break;
                case 5:
                    head = singlyLL.deleteAtBeginning(head);
                    break;
                case 6:
                    head = singlyLL.deleteAtEnd(head);
                    break;
                case 7:
                    System.out.println("Enter an index at which you want to enter the value: ");
                    index = scanner.nextInt();
                    head = singlyLL.deleteAtIndex(head, index);
                    break;
                case 8:
                    System.out.println("Enter the value you want to search: ");
                    int dataToSearch = scanner.nextInt();
                    singlyLL.search(head, dataToSearch);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
