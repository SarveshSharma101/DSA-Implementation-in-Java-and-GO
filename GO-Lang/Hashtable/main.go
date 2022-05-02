package main

import (
	services "DSA/GO-Lang/Hashtable/Services"
	"fmt"
	"os"
)

var hashTable services.HashTable

func main() {
	var hashTableSize int
	fmt.Printf("Enter the size if the hashTable you want, enter 0 to set the size to default i.e 5: ")
	fmt.Scan(&hashTableSize)

	hashTable = services.InitHashTable(hashTableSize)
	run()
}

func run() {
	for {
		fmt.Print("1.IsFull\n2.IsEmpty\n3.Peek\n4.Add\n5.Remove\n6.Display All\n7.Exit\nChoose an option:")
		var choice int
		fmt.Scan(&choice)

		switch choice {
		case 1:
			if hashTable.IsFull() {
				fmt.Println("hashTable is Full")
			} else {
				fmt.Println("hashTable is Not Full")
			}
		case 2:
			if hashTable.IsEmpty() {
				fmt.Println("hashTable is Empty")
			} else {
				fmt.Println("hashTable is Not Empty")
			}
		case 3:
			hashTable.Peek()
		case 4:
			hashTable.AddValue()
		case 5:
			var value int
			fmt.Println("Enter the value you want to remove from HashTable")
			fmt.Scan(&value)
			hashTable.Remove(value)
		case 6:
			hashTable.DisplayAll()
		case 7:
			os.Exit(0)
		}

	}
}
