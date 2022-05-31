package main

import "fmt"

/**
 *
 * Largest Contiguous Sum
 * A subarray is a part of an array including one or more contiguous/adjacent elements.
 *
 * Example
 * Array: [1, 2, 3, 4, 5]
 * Subarrays:
 * [1]
 * [2]
 * [3]
 * [4]
 * [5]
 * [1, 2]
 * [2, 3]
 * [3, 4]
 * [4, 5]
 * [1, 2, 3]
 * [2, 3, 4]
 * [3, 4, 5]
 * [1, 2, 3, 4]
 * [2, 3, 4, 5]
 * [1, 2, 3, 4, 5]
 */

func LargestContiguousSum(A *[]int) int {
	maxSum := 0
	sum := 0
	for i, _ := range *A {
		sum = 0
		for j := i; j < len(*A); j++ {
			sum = sum + (*A)[j]
			if sum > maxSum {
				maxSum = sum
			}
		}
	}
	return maxSum
}

func main() {
	A := []int{1, 2, 3, 4, 5}
	fmt.Println("------>", LargestContiguousSum(&A))
}
