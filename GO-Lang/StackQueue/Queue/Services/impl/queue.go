package servicesImp

import "fmt"

type Queue struct {
	front int
	rear  int
	queue []int
}

func InitQueue(queueSize int) *Queue {
	if queueSize == 0 {
		return &Queue{front: -1, rear: -1, queue: make([]int, 5)}
	} else {
		return &Queue{front: -1, rear: -1, queue: make([]int, queueSize)}
	}
}

func (queue *Queue) IsFull() bool {
	if (queue.front == 0 && queue.rear == len(queue.queue)-1) || queue.rear == len(queue.queue)-1 {
		return true
	} else {
		return false
	}
}

func (queue *Queue) IsEmpty() bool {
	if queue.front > queue.rear || (queue.front == -1 && queue.rear == -1) {
		return true
	} else {
		return false
	}
}

func (queue *Queue) Enqueue(value int) {
	if queue.IsFull() {
		fmt.Println("The queue is full, no room the enqueue anymore new values")
		return
	}
	if queue.front == -1 {
		queue.front = 0
		queue.rear = 0
		queue.queue[queue.rear] = value
		return
	}
	queue.rear += 1
	queue.queue[queue.rear] = value
	fmt.Printf("Value %d enqueued successfully\n", value)
}

func (queue *Queue) Dequeue() {
	if queue.IsEmpty() {
		fmt.Println("The queue is empty, nothing to dequeue")
		return
	}
	fmt.Printf("Value %d dequeued from the queue successfully\n", queue.queue[queue.front])
	queue.front += 1
	if queue.IsEmpty() {
		queue.front = -1
		queue.rear = -1
	}
}

func (queue *Queue) DisplayAll() {
	if queue.IsEmpty() {
		fmt.Println("The queue is empty, nothing to display")
		return
	}
	for i := queue.front; i <= queue.rear; i++ {
		fmt.Printf("%d :%d\n", i, queue.queue[i])
	}
}

func (queue *Queue) Peek() {
	if queue.IsEmpty() {
		fmt.Println("The queue is empty, nothing to Peek")
		return
	}
	fmt.Printf("The top most value in queue is: %d\n", queue.queue[queue.rear])
}
