package main

import "fmt"

func RemoveOccurences(A *[]int, x int) int {
	count := 0

	for i, v := range *A {
		if v == x {
			(*A)[i] = -1
			count++
		}
	}
	return len(*A) - count
}

func main() {
	A := []int{1, 4, 2, 6, 2, 6, 9, 4}
	fmt.Println("-->", RemoveOccurences(&A, 6))
}
