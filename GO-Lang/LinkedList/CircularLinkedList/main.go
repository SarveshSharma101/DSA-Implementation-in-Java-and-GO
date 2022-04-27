package main

import (
	llService "DSA/GO-Lang/LinkedList/CircularLinkedList/Service"
	"fmt"
	"os"
)

var head *llService.Node

func main() {
	run()
}

func run() {

	for {
		fmt.Printf("1.%s\n2.%s\n3.%s\n4.%s\n5.%s\n6.%s\n7.%s\n8.%s\n9 Reverse Traverse\n10.Exit\n%s\n", "Traverse", "InsertAtBeginning", "InsertAtEnd", "InsertAtIndex", "DeleteAtBeginning", "DeleteAtEnd", "DeleteAtIndex", "Search", "Choose any one of the option: ")
		var choice int
		fmt.Scan(&choice)

		switch choice {
		case 1:
			llService.Traverse(head)

		case 2:
			head = llService.InsertAtBeginning(head)

		case 3:
			head = llService.InsertAtEnd(head)

		case 4:
			var index int
			fmt.Println("Enter the index at which you want to enter the value: ")
			fmt.Scan(&index)
			head = llService.InsertAtIndex(head, index)

		case 5:
			head = llService.DeleteAtBeginning(head)

		case 6:
			head = llService.DeleteAtEnd(head)

		case 7:
			var index int
			fmt.Println("Enter the index at which you want to enter the value: ")
			fmt.Scan(&index)
			head = llService.DeleteAtIndex(head, index)

		case 8:
			var value int
			fmt.Println("Enter the value you want to search in the linkedList: ")
			fmt.Scan(&value)
			llService.Search(head, value)

		case 9:
			llService.ReverseTraverse(head)

		case 10:
			os.Exit(0)
		}
	}

}
