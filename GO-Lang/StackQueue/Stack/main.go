package main

import (
	services "DSA/GO-Lang/StackQueue/Stack/Services"
	"fmt"
	"os"
)

var stack services.Stack

func main() {
	var stackSize int
	fmt.Printf("Enter the size if the stack you want, enter 0 to set the size to default i.e 5: ")
	fmt.Scan(&stackSize)

	stack = services.InitStack(stackSize)
	run()
}

func run() {
	for {
		fmt.Print("1.IsFull\n2.IsEmpty\n3.Peek\n4.Push\n5.Pop\n6.Display All\n7.Exit\nChoose an option:")
		var choice int
		fmt.Scan(&choice)

		switch choice {
		case 1:
			if stack.IsFull(&stack) {
				fmt.Println("Stack is Full")
			} else {
				fmt.Println("Stack is Not Full")
			}
		case 2:
			if stack.IsEmpty(&stack) {
				fmt.Println("Stack is Empty")
			} else {
				fmt.Println("Stack is Not Empty")
			}
		case 3:
			value := stack.Peek(&stack)
			fmt.Println("The top most value is: ", value)
		case 4:
			var value int
			fmt.Println("Enter the value to push in the stack: ")
			fmt.Scan(&value)
			if stack.Push(&stack, value) == -101 {
				fmt.Println("Stack is full")
			}
		case 5:
			value := stack.Pop(&stack)
			if value == -101 {
				fmt.Println("Stack is Empty")
			}
			fmt.Println("Popped value is: ", value)
		case 6:
			stack.DisplayAll(&stack)
		case 7:
			os.Exit(0)
		}

	}
}
