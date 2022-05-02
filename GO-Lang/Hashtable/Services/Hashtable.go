package services

import "fmt"

type (
	HashTable struct {
		size      int
		hashArray []int
	}
)

func InitHashTable(size int) HashTable {
	if size > 0 {
		arr := make([]int, size)
		for i := 0; i < len(arr); i++ {
			arr[i] = -1
		}
		return HashTable{size: size, hashArray: arr}
	}
	return HashTable{size: 5, hashArray: []int{-1, -1, -1, -1, -1}}
}

func (arr *HashTable) IsFull() bool {
	for i, _ := range arr.hashArray {
		if arr.hashArray[i] == -1 {
			return false
		}
	}
	return true
}

func (arr *HashTable) IsEmpty() bool {
	for i, _ := range arr.hashArray {
		if arr.hashArray[i] != -1 {
			return false
		}
	}
	return true
}

func (arr *HashTable) AddValue() {
	if arr.IsFull() {
		fmt.Println("Hash table is full")
		return
	}
	var value int
	fmt.Println("Enter the value you want to enter in the HashTable")
	fmt.Scan(&value)
	index := hash(value, arr.size)

	if arr.hashArray[index] != -1 {
		fmt.Println("index ", index, " is available")
		return
	}
	arr.hashArray[index] = value
}

func hash(value int, size int) int {
	return value % size
}

func (arr *HashTable) Remove(value int) {
	if arr.IsEmpty() {
		fmt.Println("Hash table is Empty")
		return
	}
	index := hash(value, arr.size)
	fmt.Println("Removed value successfully")
	arr.hashArray[index] = -1
}

func (arr *HashTable) DisplayAll() {
	if arr.IsEmpty() {
		fmt.Println("Hash table is Empty")
		return
	}

	for i, v := range arr.hashArray {
		fmt.Println(i, "-->", v)
	}
}

func (arr *HashTable) Peek() {
	if arr.IsEmpty() {
		fmt.Println("Hash table is Empty")
		return
	}

	fmt.Println("---->", arr.hashArray[len(arr.hashArray)-1])
}
