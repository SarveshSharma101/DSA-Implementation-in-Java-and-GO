package service

import (
	"fmt"
)

type (
	Node struct {
		data int
		next *Node
		prev *Node
	}
)

func getNode(value int) *Node {
	return &Node{data: value, next: nil, prev: nil}
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
	fmt.Println("----->", temp.data)
	temp = temp.next
	for {
		if temp == head {
			break
		}
		fmt.Println("----->", temp.data)
		temp = temp.next
	}
}

func ReverseTraverse(head *Node) {
	if IsEmpty(head) {
		fmt.Println("Linked List is empty, nothing to print")
		return
	}
	temp := head
	temp = temp.prev
	for {
		if temp == head {
			break
		}
		fmt.Println("----->", temp.data)
		temp = temp.prev
	}
	fmt.Println("----->", temp.data)
}

func InsertAtBeginning(head *Node) *Node {
	var value int
	fmt.Println("Enter the value you want to enter in the list: ")
	fmt.Scan(&value)

	if IsEmpty(head) {
		head = getNode(value)
		head.next = head
		head.prev = head
		return head
	}
	newNode := getNode(value)
	newNode.next = head
	newNode.prev = head.prev
	head.prev.next = newNode
	head.prev = newNode

	return newNode
}

func InsertAtEnd(head *Node) *Node {
	if IsEmpty(head) {
		return InsertAtBeginning(head)
	}

	var value int
	fmt.Println("Enter the value you want to enter in the list: ")
	fmt.Scan(&value)

	temp := head
	for {
		if temp.next == head {
			break
		}
		temp = temp.next
	}
	newNode := getNode(value)
	newNode.next = head
	head.prev = newNode
	temp.next = newNode
	newNode.prev = temp

	return head
}

func InsertAtIndex(head *Node, index int) *Node {
	if IsEmpty(head) {
		return InsertAtBeginning(head)
	}

	var value int
	fmt.Println("Enter the value you want to enter in the list: ")
	fmt.Scan(&value)

	temp := head
	for i := 0; i < index-1; i++ {
		temp = temp.next
	}
	newNode := getNode(value)
	newNode.next = temp.next
	temp.next.prev = newNode
	newNode.prev = temp
	temp.next = newNode

	return head
}

func Search(head *Node, dataToSearch int) {
	temp := head
	if temp.data == dataToSearch {
		fmt.Println("Data Found!!!")
		return
	}
	temp = temp.next
	for {
		if temp == head {
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
	head.prev.next = head.next
	head.next.prev = head.prev
	head = head.next
	return head
}

func DeleteAtEnd(head *Node) *Node {
	temp := head
	for {
		if temp.next.next == head {
			break
		}
		temp = temp.next
	}
	temp.next.next.prev = temp
	temp.next = head
	return head
}

func DeleteAtIndex(head *Node, index int) *Node {
	temp := head
	for i := 0; i < index-1; i++ {
		temp = temp.next
	}
	temp.next = temp.next.next
	temp.next.prev = temp
	return head
}
