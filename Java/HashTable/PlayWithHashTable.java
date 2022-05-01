package HashTable;

import HashTable.Service.Hashtable;
import Services.DsaRunner;

import java.util.Scanner;

public class PlayWithHashTable implements DsaRunner {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new PlayWithHashTable().run();
    }

    @Override
    public void run() {
        Hashtable hashtable;
        System.out.println("Enter the size of hashtable, enter 0 to select the default size i.e 5: ");
        int hashSize = scanner.nextInt();
        hashtable = new Hashtable(hashSize);

        while (true) {
            System.out.print("\nChoose the operation to perform on hashtable.\n1.Is Full?\n2.Is Empty?\n3.Peek\n4.Add\n5.Delete\n6.Display All\n7.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (hashtable.isFull())
                        System.out.println("hashtable is Full");
                    else
                        System.out.println("hashtable is not yet full");
                    break;
                case 2:
                    if (hashtable.isEmpty())
                        System.out.println("hashtable is Empty, Please add some values");
                    else
                        System.out.println("hashtable is not empty, there are values present in the hashtable");
                    break;
                case 3:
                    hashtable.peek();
                    break;
                case 4:
                    System.out.println("Enter an integer value you want to add in the hashtable: ");
                    int value = scanner.nextInt();
                    hashtable.addValue(value, value);
                    break;
                case 5:
                    System.out.println("Enter an integer value you want to delete in the hashtable: ");
                    value = scanner.nextInt();
                    hashtable.deleteValue(value, value);
                case 6:
                    hashtable.displayAll();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
