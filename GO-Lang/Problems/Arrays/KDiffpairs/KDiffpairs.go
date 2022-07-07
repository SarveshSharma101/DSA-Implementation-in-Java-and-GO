package main

import (
	"fmt"
	"math"
)

/**
 * k-diff pairs
 * Medium
 * 50
 * Given a sorted array A of size n and a number k,
 * return the number of unique pairs which have a difference of k.
 *
 * |arr[i] - arr[j]| = k where i < j
 */

func kDiffPairs(A *[]int, k int) int {
	count := 0
	x := 0

	for i := 0; i < len(*A); i++ {
		if (*A)[i] != x {
			x = (*A)[i]
			for j := i; j < len(*A); j++ {
				if int(math.Abs(float64((*A)[j]-x))) == k {
					count++
				}
			}
		}
	}

	return count
}

func main() {
	A := []int{1, 3, 5, 7, 10}
	fmt.Println("-->", kDiffPairs(&A, 2))
	fmt.Println("-->", kDiffPairs(&A, 3))
	fmt.Println("-->", kDiffPairs(&A, 1))
}
