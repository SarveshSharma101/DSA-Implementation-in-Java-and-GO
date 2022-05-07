package main

import "fmt"

func BinarySearch(array *[]int, dataToSearch int) {
	low := 0
	high := len(*array) - 1

	for low < high {

		if (*array)[low] == dataToSearch {
			fmt.Println("Data found at index: ", low)
			return
		} else if (*array)[high] == dataToSearch {
			fmt.Println("Data found at index: ", high)
			return
		}

		mid := (low + high) / 2

		if (*array)[mid] == dataToSearch {
			fmt.Println("Data found at index: ", mid)
			return
		} else if dataToSearch > (*array)[mid] {
			low = mid + 1
		} else {
			high = mid - 1
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

	BinarySearch(&array, value)
}
