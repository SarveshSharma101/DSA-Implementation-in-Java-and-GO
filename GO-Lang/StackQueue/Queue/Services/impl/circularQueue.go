package servicesImp

import "fmt"

type CircularQueue struct {
	queueSize int
	front     int
	rear      int
	queue     []int
}

func InitCQueue(queueSize int) *CircularQueue {
	if queueSize == 0 {
		return &CircularQueue{queueSize: 5, front: -1, rear: -1, queue: make([]int, 5)}
	} else {
		return &CircularQueue{queueSize: queueSize, front: -1, rear: -1, queue: make([]int, queueSize)}
	}
}

func (cQueue *CircularQueue) IsFull() bool {
	if (cQueue.front == 0 && cQueue.rear == cQueue.queueSize-1) || cQueue.front == cQueue.rear+1 {
		return true
	}
	return false
}

func (cQueue *CircularQueue) IsEmpty() bool {
	return cQueue.front == -1
}

func (cQueue *CircularQueue) Enqueue(value int) {
	if cQueue.IsFull() {
		fmt.Println("Circular Queue is full, no room the enqueue any new value")
		return
	}

	if cQueue.front == -1 {
		cQueue.front = 0
		cQueue.rear = 0
		cQueue.queue[cQueue.rear] = value
		return
	}

	cQueue.rear = (cQueue.rear + 1) % cQueue.queueSize
	cQueue.queue[cQueue.rear] = value
}

func (cQueue *CircularQueue) Dequeue() {
	if cQueue.IsEmpty() {
		fmt.Println("Circular Queue is empty,no value to dequeue")
		return
	}

	value := cQueue.queue[cQueue.front]
	fmt.Println("Dequeued value is: ", value)

	cQueue.front = (cQueue.front + 1) % cQueue.queueSize
	if cQueue.front == (cQueue.rear+1)%cQueue.queueSize {
		cQueue.front = -1
		cQueue.rear = -1
	}
}

func (cQueue *CircularQueue) Peek() {
	if cQueue.IsEmpty() {
		fmt.Println("Circular Queue is empty,no value to peek")
		return
	}
	fmt.Println("Dequeued value is: ", cQueue.queue[cQueue.rear])
}

func (cQueue *CircularQueue) DisplayAll() {
	if cQueue.IsEmpty() {
		fmt.Println("Circular Queue is empty,no value to display")
		return
	}

	if cQueue.front <= cQueue.rear {
		displayLoop(cQueue, cQueue.front, cQueue.rear)
	} else {
		displayLoop(cQueue, 0, cQueue.rear)
		displayLoop(cQueue, cQueue.front, cQueue.queueSize-1)
	}
}

func displayLoop(cQueue *CircularQueue, start int, end int) {
	for i := start; i <= end; i++ {
		fmt.Printf("%d: %d\n", i, cQueue.queue[i])
	}
}
