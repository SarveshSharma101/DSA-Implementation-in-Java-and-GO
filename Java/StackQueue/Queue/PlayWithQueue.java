package StackQueue.Queue;

import Services.DsaRunner;


import java.util.Scanner;

public class PlayWithQueue implements DsaRunner {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { new PlayWithQueue().run(); }
    @Override
    public void run() {
        Queue queue;
        System.out.println("Enter the size of Queue, enter 0 to select the default size i.e 5: ");
        int queueSize = scanner.nextInt();
        queue = new Queue(queueSize);

        while (true) {
            System.out.print("\nChoose the operation to perform on Queue.\n1.Is Full?\n2.Is Empty?\n3.Peek\n4.Enqueue\n5.Dequeue\n6.Display All\n7.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (queue.isFull())
                        System.out.println("Queue is Full");
                    else
                        System.out.println("Queue is not yet full");
                    break;
                case 2:
                    if (queue.isEmpty())
                        System.out.println("Queue is Empty, Please add some values");
                    else
                        System.out.println("Queue is not empty, there are values present in the stack");
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    System.out.println("Enter an integer value you want to enqueue in the queue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 5:
                    queue.dequeue();
                    break;
                case 6:
                    queue.displayAll();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
