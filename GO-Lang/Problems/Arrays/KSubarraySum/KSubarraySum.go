package main

import "fmt"

/**
 * K-Subarray Sum
 * Easy
 * 30 / 30
 * Given an array and a number k, find the sum of all the subarrays of size k.
 */

func KSubarraySum(A *[]int, k int) []int {
	C := []int{}
	sum := 0

	for i := 0; i <= len(*A)-k; i++ {
		sum = 0
		for j := i; j < k+i; j++ {
			sum = sum + (*A)[j]
		}
		C = append(C, sum)
	}
	return C
}

func main() {
	A := []int{3, 5, 6, 2, 4, 7, 8}
	B := []int{1, 3, 3, 3, 4, 4}

	fmt.Println("A -> ", KSubarraySum(&A, 3))
	fmt.Println("B -> ", KSubarraySum(&B, 1))
}
