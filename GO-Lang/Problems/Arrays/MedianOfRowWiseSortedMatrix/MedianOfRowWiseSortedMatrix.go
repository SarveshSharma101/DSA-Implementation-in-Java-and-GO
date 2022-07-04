package main

import (
	"fmt"
	"sort"
)

/**
 * Median of Row-wise Sorted Matrix
 * Medium
 * 50 / 50
 * Given an n*m matrix which is sorted row-wise, you need to find the median of the matrix.
 *
 * Median of a group of numbers is the middle element after they are sorted.
 * Both n and m are guaranteed to be odd numbers, therefore there’s only one middle number.
 *
 * Example
 * 1 2 3
 * 3 3 4
 * 1 1 2
 * Median: 2
 */

func CalculateMedianOfMatrix(A *[][]int) int {
	value := 0
	a := []int{}

	for i := 0; i < len(*A); i++ {
		for j := 0; j < len((*A)[0]); j++ {
			a = append(a, (*A)[i][j])
		}
	}
	sort.Slice(a, func(i, j int) bool {
		return a[i] < a[j]
	})
	value = a[len(a)/2]
	return value
}

func main() {
	A := [][]int{{1, 2, 3}, {3, 3, 4}, {1, 1, 2}}

	fmt.Println("-------->", CalculateMedianOfMatrix(&A))
}
