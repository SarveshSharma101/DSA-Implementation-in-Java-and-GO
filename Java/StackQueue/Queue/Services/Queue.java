package StackQueue.Queue.Services;

public interface Queue {

    public boolean isFull();

    public boolean isEmpty();

    public void peek();

    public void enqueue(int value);

    public void dequeue();

    public void displayAll();
}
