package main

import (
	service "DSA/GO-Lang/Sorting/MergeSort/Service"
	"fmt"
)

func main() {
	var size int
	var array []int
	fmt.Println("Enter the size of array to create: ")
	fmt.Scanln(&size)

	array = make([]int, 5)
	fmt.Println("Enter the elements of array: ")
	for i := 0; i < size; i++ {
		fmt.Scanln(&array[i])
	}
	service.MergeSort(&array, 0, len(array)-1)
	for i, v := range array {
		fmt.Println(i, ":", v)
	}
}
