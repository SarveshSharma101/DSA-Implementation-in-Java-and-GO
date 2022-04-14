package StackQueue.Queue;

import Services.DsaRunner;


import java.util.Scanner;

public class PlayWithQueue implements DsaRunner {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { new PlayWithQueue().run(); }

    public StackQueue.Queue.Services.Queue getQueue(int queueSize, int choice){
        if(choice == 1)
            return new Queue(queueSize);
        else
            return new CircularQueue(queueSize);
    }

    @Override
    public void run() {

        System.out.println("Enter the size of Queue, enter 0 to select the default size i.e 5: ");
        int queueSize = scanner.nextInt();
        System.out.println("1. Normal Queue\n2.Circular Queue\n Select the queue you want: ");
        int choice = scanner.nextInt();
        StackQueue.Queue.Services.Queue queue = getQueue(queueSize, choice);

        while (true) {
            System.out.print("\nChoose the operation to perform on Queue.\n1.Is Full?\n2.Is Empty?\n3.Peek\n4.Enqueue\n5.Dequeue\n6.Display All\n7.Exit");
            choice = scanner.nextInt();

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
