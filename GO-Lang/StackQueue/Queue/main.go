package main

import (
	services "DSA/GO-Lang/StackQueue/Queue/Services"
	servicesImp "DSA/GO-Lang/StackQueue/Queue/Services/impl"
	"fmt"
	"os"
)

var queue services.Queues

func main() {
	var queueSize int
	fmt.Printf("Enter the size if the queue you want, enter 0 to set the size to default i.e 5: ")
	fmt.Scan(&queueSize)

	fmt.Println("1. Circular Queue\n2. Queue\nChoose the queue you want: ")
	var choice int
	fmt.Scan(&choice)
	if choice == 1 {
		queue = servicesImp.InitCQueue(queueSize)
	} else {
		queue = servicesImp.InitQueue(queueSize)
	}

	run()
}

func run() {
	for {
		fmt.Print("1.IsFull\n2.IsEmpty\n3.Peek\n4.Enqueue\n5.Dequeue\n6.Display All\n7.Exit\nChoose an option:")
		var choice int
		fmt.Scan(&choice)

		switch choice {
		case 1:
			if queue.IsFull() {
				fmt.Println("Queue is Full")
			} else {
				fmt.Println("Queue is Not Full")
			}
		case 2:
			if queue.IsEmpty() {
				fmt.Println("Queue is Empty")
			} else {
				fmt.Println("Queue is Not Empty")
			}
		case 3:
			queue.Peek()
		case 4:
			var value int
			fmt.Println("Enter the value to enqueue in the queue: ")
			fmt.Scan(&value)
			queue.Enqueue(value)
		case 5:
			queue.Dequeue()
		case 6:
			queue.DisplayAll()
		case 7:
			os.Exit(0)
		}
	}
}
