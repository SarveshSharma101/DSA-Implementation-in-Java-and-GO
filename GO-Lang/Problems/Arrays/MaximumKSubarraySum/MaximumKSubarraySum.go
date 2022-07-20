package main

import "fmt"

func MaxKSubarraySum(A *[]int, k int) int {
	maxSum, sum := 0, 0
	for i := 0; i <= len(*A)-k; i++ {
		sum = 0
		for j := i; j < i+k; j++ {
			sum = sum + (*A)[j]
		}
		if sum > maxSum {
			maxSum = sum
		}
	}

	return maxSum
}

func main() {
	A := []int{3, 5, 6, 2, 4, 7, 8}
	B := []int{1, 3, 3, 3, 4, 4}

	fmt.Println("-->", MaxKSubarraySum(&A, 3))
	fmt.Println("-->", MaxKSubarraySum(&B, 1))
}
