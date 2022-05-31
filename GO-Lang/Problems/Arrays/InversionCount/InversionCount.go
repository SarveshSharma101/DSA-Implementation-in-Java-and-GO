package main

import "fmt"

func GetInversionCount(A *[]int) int {
	count := 0

	for i, v := range *A {
		for j := i + 1; j < len(*A); j++ {
			if v > (*A)[j] {
				count++
			}
		}
	}
	return count
}

func main() {
	A := []int{10, 1, 2, 3, 4}
	fmt.Println("---->", GetInversionCount(&A))
}
