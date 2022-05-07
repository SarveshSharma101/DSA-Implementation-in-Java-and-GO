package main

import "fmt"

func Search(array *[]int, dataToSearch int) {

	for i, data := range *array {
		if data == dataToSearch {
			fmt.Println("Data found at index: ", i)
			return
		}
	}
	fmt.Println("Data not found")
}

func main() {
	var size int
	var array []int
	fmt.Println("Enter the size of array to create: ")
	fmt.Scanln(&size)

	array = make([]int, size)
	fmt.Println("Enter the elements of array: ")
	for i := 0; i < size; i++ {
		fmt.Scanln(&array[i])
	}

	fmt.Println("Enter the elements  to search in the array: ")
	var value int
	fmt.Scanln(&value)

	Search(&array, value)
}
