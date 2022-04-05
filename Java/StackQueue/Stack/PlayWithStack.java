package StackQueue.Stack;

import Services.DsaRunner;

import java.util.Scanner;

public class PlayWithStack implements DsaRunner {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new PlayWithStack().run();
    }

    @Override
    public void run() {

        Stack stack;
        System.out.println("Enter the size of stack, enter 0 to select the default size i.e 5: ");
        int stackSize = scanner.nextInt();
        if (stackSize == 0)
            stack = new Stack();
        else
            stack = new Stack(stackSize);

        while (true) {
            System.out.print("\nChoose the operation to perform on stack.\n1.Is Full?\n2.Is Empty?\n3.Peek\n4.Push\n5.Pop\n6.Display All\n7.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (stack.isFull())
                        System.out.println("Stack is Full");
                    else
                        System.out.println("Stack is not yet full");
                    break;
                case 2:
                    if (stack.isEmpty())
                        System.out.println("Stack is Empty, Please add some values");
                    else
                        System.out.println("Stack is not empty, there are values present in the stack");
                    break;
                case 3:
                    int val = stack.peek();
                    if (val == -101)
                        System.out.println("Stack is Empty");
                    else
                        System.out.println("The top most value in stack is: " + val);
                    break;
                case 4:
                    System.out.println("Enter an integer value you want to push in the stack: ");
                    int value = scanner.nextInt();
                    if (stack.push(value) == -101)
                        System.out.println("The stack is full cannot push any more values");
                    else
                        System.out.printf("Value: %d entered successfully", value);
                    break;
                case 5:
                    val = stack.pop();
                    if (val == -101)
                        System.out.println("Stack is Empty");
                    else
                        System.out.println("Popped value from the stack is: " + val);
                    break;
                case 6:
                    stack.displayAll();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
