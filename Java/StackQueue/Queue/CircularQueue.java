package StackQueue.Queue;

import StackQueue.Queue.Services.Queue;

public class CircularQueue implements Queue {

    private int front, rear, queueSize=5;
    private int[] circularQueue;

    public CircularQueue(int queueSize) {
        this.front = -1;
        this.rear = -1;
        if (queueSize !=0)
            this.queueSize = queueSize;
        this.circularQueue = new int[this.queueSize];
    }

    public boolean isFull(){
        if ((this.front==0 && this.rear==this.queueSize-1)||(this.front==this.rear+1))
            return true;
        return false;
    }

    public boolean isEmpty(){
        if (this.front==-1)
            return true;
        return false;
    }

    public void enqueue(int value){
        if (this.isFull()) {
            System.out.println("The circular queue is full, no room to enqueue new values");
            return;
        }
        if(this.front==-1) {
            this.front = 0;
            this.rear = 0;
            this.circularQueue[this.rear] = value;
            System.out.println("Value entered successfully");
            return;
        }
        this.rear = (this.rear+1)%this.queueSize;
        this.circularQueue[this.rear] = value;
        System.out.println("Value entered successfully");
    }

    public void dequeue(){
        if(this.isEmpty()){
            System.out.println("Queue is empty, nothing to remove");
            return;
        }
        int value = this.circularQueue[this.front];
        System.out.println("Value dequeued from the queue is: "+value);
        this.front = (this.front+1)%this.queueSize;
        if(this.front==(this.rear+1)%this.queueSize){
            this.front = -1;
            this.rear = -1;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty, nothing to peek on!!! :(");
            return;
        }
        System.out.println("The latest value entered in the queue is: "+this.circularQueue[this.rear]);
    }

    public void displayAll() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty, nothing to display!!! :(");
            return;
        }
        if(this.front<=rear){
            displayLoop(this.front, this.rear);
        }else {
            displayLoop(0, this.rear);
            displayLoop(this.front, this.queueSize-1);
        }
    }

    private void displayLoop(int start, int end){
        for (int i=start; i<=end; i++){
            System.out.printf("%d : %d\n", i,this.circularQueue[i]);
        }
    }
}
