package main

import "fmt"

func SearchRange(A *[]int, key int) []int {
	C := []int{-1, -1}

	for i, v := range *A {
		if v == key {
			for j := i; j < len(*A); j++ {
				if j == len(*A)-1 && (*A)[j] == key {
					C[0] = i
					C[1] = j
					break
				}
				if (*A)[j] > key {
					C[0] = i
					C[1] = j - 1
					break
				}
			}
			break
		}
	}
	return C
}

func main() {
	A := []int{1, 2, 3, 3, 3, 4, 4, 5}

	fmt.Println("----->", SearchRange(&A, 0))
}
