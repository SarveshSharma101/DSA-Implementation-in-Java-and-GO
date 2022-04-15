package services

type (
	Queues interface {
		Peek()
		DisplayAll()
		Dequeue()
		Enqueue(value int)
		IsEmpty() bool
		IsFull() bool
	}
)
