package StackQueue.Queue;

public class Queue {

    private int front = -1, rear = -1, queueSize = 5;
    private int[] queue;

    public Queue(int queueSize) {
        if(queueSize != 0)
            this.queueSize = queueSize;
        this.queue = new int[this.queueSize];
    }

    public boolean isFull(){
        return (this.front == 0 && this.rear==this.queueSize-1);
    }

    public boolean isEmpty(){
        return (this.front > this.rear || (this.rear == -1 && this.front==-1));
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("The Queue is full, no room for new values!!! :(");
            return;
        }
        if (this.front==-1 && this.rear==-1){
            this.front = 0;
        }
        this.queue[++this.rear] = value;
        System.out.println("Value entered successfully in the queue :) -> "+ this.queue[this.rear]);
    }

    public void dequeue(){
        if (isEmpty()) {
            System.out.println("The Queue is Empty, nothing to remove!!! :(");
            return;
        }
        System.out.println("The value removed from the queue is: "+this.queue[this.front++]);
        if (this.front==this.queueSize){
            this.front= this.rear = -1;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty, nothing to peek on!!! :(");
            return;
        }
        System.out.println("The latest value entered in the queue is: "+this.queue[this.rear]);
    }

    public void displayAll() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty, nothing to display!!! :(");
            return;
        }
        for (int i=this.front; i<=this.rear; i++){
            System.out.printf("%d : %d\n", i,this.queue[i]);
        }
    }
}
