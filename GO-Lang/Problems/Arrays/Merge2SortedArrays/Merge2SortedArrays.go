package main

import "fmt"

/**
*Merge Two Sorted Arrays
*
*Given two sorted arrays A and B, find the merged sorted array C by merging A and B.
*
*Example:
*A: [1, 2, 3, 4, 4]
*B: [2, 4, 5, 5]
*C: [1, 2, 2, 3, 4, 4, 4, 5, 5]
**/

func Merge2SortedArrays(A *[]int, B *[]int) []int {

	C := make([]int, len(*A)+len(*B))

	i, j, k := 0, 0, 0
	fmt.Println("************", len(*A))
	fmt.Println("************", len(*B))
	for i < len(*A) && j < len(*B) {
		if (*A)[i] <= (*B)[j] {
			C[k] = (*A)[i]
			k++
			i++
		} else {
			C[k] = (*B)[j]
			k++
			j++
		}
	}

	for i < len(*A) {
		C[k] = (*A)[i]
		k++
		i++
	}

	for j < len(*B) {
		C[k] = (*B)[j]
		k++
		j++
	}

	return C
}

func main() {
	A := []int{1, 2, 3, 4, 4}
	B := []int{2, 4, 5, 5}

	C := Merge2SortedArrays(&A, &B)

	fmt.Println("-------->", C)
}
