package main

import "fmt"

func GetInsertPosition(arr *[]int, key int) int {
	i := 0
	for i < len(*arr) && (*arr)[i] < key {
		i++
	}
	return i
}

func main() {
	A := []int{1, 2, 3, 5, 7, 9, 11, 14}

	fmt.Println("----->", GetInsertPosition(&A, 3))
	fmt.Println("----->", GetInsertPosition(&A, 31))
	fmt.Println("----->", GetInsertPosition(&A, 8))
	fmt.Println("----->", GetInsertPosition(&A, -3))
	fmt.Println("----->", GetInsertPosition(&A, 12))
}
