package StackQueue.Stack;

import Services.DsaRunner;

public class Stack {

    private int stackSize=5, top = -1;
    private int[] stack;

    public Stack() {
        this.stack = new int[this.stackSize];
    }

    public Stack(int stackSize) {
        this.stackSize = stackSize;
        this.stack = new int[this.stackSize];
    }

    public boolean isFull(){
        return (this.top == this.stackSize-1);
    }

    public boolean isEmpty(){
        return (this.top == -1);
    }

    public int peek(){
        if (isEmpty())
            return -101;
        return this.stack[this.top];
    }

    public int pop(){
        if (isEmpty())
            return -101;

        int poppedValue = peek();
        this.top--;
        return poppedValue;
    }

    public int push(int value){
        if (isFull())
            return -101;
        this.stack[++this.top] = value;
        return 0;
    }


    public void displayAll() {
        for (int i=0; i<=this.top; i++) {
            System.out.println("---->"+this.stack[i]);
        }
    }
}
