package service

import (
	"fmt"
)

type (
	Node struct {
		data int
		next *Node
	}
)

func getNode(value int) *Node {
	return &Node{data: value, next: nil}
}

func IsEmpty(head *Node) bool {
	return head == nil
}

func Traverse(head *Node) {
	if IsEmpty(head) {
		fmt.Println("Linked List is empty, nothing to print")
		return
	}
	temp := head
	for {
		if IsEmpty(temp) {
			break
		}
		fmt.Println("----->", temp.data)
		temp = temp.next
	}
}

func InsertAtBeginning(head *Node) *Node {
	var value int
	fmt.Println("Enter the value you want to enter in the list: ")
	fmt.Scan(&value)

	if IsEmpty(head) {
		head = getNode(value)
		return head
	}
	newNode := getNode(value)
	newNode.next = head

	return newNode
}

func InsertAtEnd(head *Node) *Node {
	var value int
	fmt.Println("Enter the value you want to enter in the list: ")
	fmt.Scan(&value)

	if IsEmpty(head) {
		head = getNode(value)
		return head
	}

	temp := head
	for {
		if temp.next == nil {
			break
		}
		temp = temp.next
	}
	newNode := getNode(value)
	temp.next = newNode
	return head
}

func InsertAtIndex(head *Node, index int) *Node {
	var value int
	fmt.Println("Enter the value you want to enter in the list: ")
	fmt.Scan(&value)

	if IsEmpty(head) {
		head = getNode(value)
		return head
	}

	temp := head
	for i := 0; i < index-1; i++ {
		temp = temp.next
	}
	newNode := getNode(value)
	newNode.next = temp.next
	temp.next = newNode
	return head
}

func Search(head *Node, dataToSearch int) {
	temp := head
	for {
		if temp == nil {
			break
		}
		if temp.data == dataToSearch {
			fmt.Println("Data Found!!!")
			return
		}
		temp = temp.next
	}
	fmt.Println("Data not found")
}

func DeleteAtBeginning(head *Node) *Node {
	return head.next
}

func DeleteAtEnd(head *Node) *Node {
	temp := head
	for {
		if temp.next.next == nil {
			break
		}
		temp = temp.next
	}
	temp.next = nil
	return head
}

func DeleteAtIndex(head *Node, index int) *Node {
	temp := head
	for i := 0; i < index-1; i++ {
		temp = temp.next
	}
	temp.next = temp.next.next
	return head
}
