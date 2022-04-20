package main

import (
	singllyService "DSA/GO-Lang/LinkedList/SinglyLL/Service"
	"fmt"
	"os"
)

var head *singllyService.Node

func main() {
	run()
}

func run() {

	for {
		fmt.Printf("1.%s\n2.%s\n3.%s\n4.%s\n5.%s\n6.%s\n7.%s\n8.%s\n9.Exit\n%s\n", "Traverse", "InsertAtBeginning", "InsertAtEnd", "InsertAtIndex", "DeleteAtBeginning", "DeleteAtEnd", "DeleteAtIndex", "Search", "Choose any one of the option: ")
		var choice int
		fmt.Scan(&choice)

		switch choice {
		case 1:
			singllyService.Traverse(head)

		case 2:
			head = singllyService.InsertAtBeginning(head)

		case 3:
			head = singllyService.InsertAtEnd(head)

		case 4:
			var index int
			fmt.Println("Enter the index at which you want to enter the value: ")
			fmt.Scan(&index)
			head = singllyService.InsertAtIndex(head, index)

		case 5:
			head = singllyService.DeleteAtBeginning(head)

		case 6:
			head = singllyService.DeleteAtEnd(head)

		case 7:
			var index int
			fmt.Println("Enter the index at which you want to enter the value: ")
			fmt.Scan(&index)
			head = singllyService.DeleteAtIndex(head, index)

		case 8:
			var value int
			fmt.Println("Enter the value you want to search in the linkedList: ")
			fmt.Scan(&value)
			singllyService.Search(head, value)

		case 9:
			os.Exit(0)
		}
	}

}
