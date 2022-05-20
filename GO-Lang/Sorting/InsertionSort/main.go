package main

import (
	service "DSA/GO-Lang/Sorting/InsertionSort/Service"
	"fmt"
)

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
	// fmt.Println("1.Descending\n2.Ascending\nChoose the sorting order: ")
	// var value int
	// fmt.Scanln(&value)

	service.Sort(&array)
	for i, v := range array {
		fmt.Println(i, ":", v)
	}
}
