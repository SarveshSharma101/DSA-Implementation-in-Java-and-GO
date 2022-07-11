package main

import "fmt"

/**
 * Dutch National Flag
 * Medium
 * 50 / 50
 * Sort an array A where each of the elements belong to the set: {0, 1, 2}.
 *
 * Expected Time Complexity: O(n)
 *
 * Try to solve it without storing the count of 0s, 1s and 2s.
 */

func SortTheArray(A *[]int) {
	max := getMax(A)
	C := make([]int, max+1)

	for _, v := range *A {
		C[v]++
	}

	j := 0

	for i, v := range C {
		for v != 0 {
			(*A)[j] = i
			v--
			j++
		}
	}
}

func getMax(A *[]int) int {
	max := 0
	for _, v := range *A {
		if v > max {
			max = v
		}
	}
	return max
}

func main() {
	A := []int{2, 2, 1, 0, 0}
	SortTheArray(&A)
	fmt.Println("--->", A)
}
